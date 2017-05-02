
package Domain;

public class Transaction {
   private String name;
   private String surName;
   private String src_iban;
   private String dst_iban;
   private String amount;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setSrc_iban(String src_iban) {
        this.src_iban = src_iban;
    }

    public void setDst_iban(String dst_iban) {
        this.dst_iban = dst_iban;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
   
}
