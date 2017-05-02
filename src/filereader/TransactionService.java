
package filereader;

import Domain.Transaction;
import java.util.ArrayList;
import java.util.List;


public class TransactionService {
  private List<Transaction> transactionList = new ArrayList<Transaction>();
 
 public void setObjectToList (Transaction transaction){
   transactionList.add(transaction);
 }
  
public String getAllAmount(int id){
   return transactionList.get(id).getAmount();
} 
}




