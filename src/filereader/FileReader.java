
package filereader;

import filereader.Service.FileStreamService;
import filereader.Service.TransactionService;
import java.io.IOException;

public class FileReader {

    private static FileStreamService fservice = new FileStreamService("test.txt");
    private static TransactionService tservice = new TransactionService();
    
    public static void main(String[] args) throws IOException {
    fservice.read();
    tservice.getList(fservice.getListElement());
    tservice.run();
    tservice.getAllAmount();
       
    }
   
}
