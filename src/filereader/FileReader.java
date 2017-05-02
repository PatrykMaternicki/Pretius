
package filereader;

import filereader.Service.FileStreamService;
import filereader.Service.TransactionService;
import java.io.IOException;

public class FileReader {

    private static FileStreamService fservice;
    private static TransactionService tservice = new TransactionService();
    
    public static void main(String[] args) throws IOException {
    fservice = new FileStreamService(args[0]);
    fservice.read();
    tservice.getList(fservice.getListElement());
    tservice.run();
    tservice.getAllAmount();
       
    }
   
}
