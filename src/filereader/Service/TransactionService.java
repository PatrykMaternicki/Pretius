
package filereader.Service;

import Domain.Transaction;
import java.util.ArrayList;
import java.util.List;


public class TransactionService {
  
  private Builder builder = new Builder();
  private List<Transaction> transactionList = new ArrayList<Transaction>();
  private List<String[]> elementList = new ArrayList<String[]>();
 
  
    public void getList(List<String[]> listElement) {
      elementList  = listElement;
    }

    public void run() {
      transactionList = builder.build(elementList);
    }
    
    public void getAllAmount(){
     transactionList.forEach((transaction) -> System.out.println(transaction.getAmount()));
    }
   
    
}




