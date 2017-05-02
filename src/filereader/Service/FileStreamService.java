package filereader.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FileStreamService {
private String nameFile;
final static TreeMap<String, String> map = new TreeMap<String, String>();

    public FileStreamService(String nameFile) {
        this.nameFile = nameFile;
    }



public static void read() throws IOException{
    streamFileToLineList();
    changeMapToObject();
}

private static void  streamFileToLineList() throws IOException{
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile), "Cp1252"));         

            String line;
            while ((line = br.readLine()) != null) {
               if (!line.startsWith("@") && !line.isEmpty()) {
                String[] pair = line.trim().split("@");
                map.put(pair[0].trim(), pair[1].trim());
            }
            }
            br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private static void changeMapToObject() {
      for (int i =0 ; i > map.size(); i++){
       System.out.println(map.get(1));  
      }
    }

    private void getValueOnMap(String get) {
       String value = get;
       
    }
  



}

