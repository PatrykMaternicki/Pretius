
package filereader.Service;

import Domain.Transaction;
import java.util.ArrayList;
import java.util.List;

public class Builder {
private List<Transaction> transactionList = new ArrayList<Transaction>();


    public List<Transaction> build(List<String[]> elementList) {
       elementList.forEach((element) -> getValue(element));
       return transactionList;
    }

    private void getValue(String[] element) {
        List<String> values = new ArrayList<String>();
        String[] splitedValue;
        for (String value : element){
          if (value.split(":").length == 1){
              continue;
          }
          splitedValue = value.split(":");
          values.add(splitedValue[1]);
        }
        construct(values);     
    }

    private void construct(List<String> values) {
       Transaction transaction = new Transaction();
       transaction.setName(values.get(0));
       transaction.setSurName(values.get(1));
       transaction.setSrc_iban(values.get(2));
       transaction.setDst_iban(values.get(3));
       transaction.setAmount(values.get(4));
       pushToList(transaction);
       
    }
    private void pushToList(Transaction transaction) {
       transactionList.add(transaction);
    }

    
}
