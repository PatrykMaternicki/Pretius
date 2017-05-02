package filereader.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FileStreamService { 
private static String nameFile;
private static List<String> lines = new ArrayList<String>();
private static List<String []> listElement = new ArrayList<String []>();

    public FileStreamService(String nameFile) {
        this.nameFile = nameFile;
    }

    public static void read() throws IOException{
    streamFileToLineList();
    streamLineToObject();
}

     private static void streamFileToLineList() throws FileNotFoundException, IOException {
      FileInputStream fstream = new FileInputStream(nameFile);
      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
      String line;
    while ((line = br.readLine()) != null)   {
      pushLine(br.readLine());
    }

    br.close();  
    }
    
     private static boolean isLineNull(String Line){
         return Line.equals(null);
     }
     
    private static void pushLine(String stringLine) {
        lines.add(stringLine);
    }
    
    private static void streamLineToObject() {
     lines.forEach((line) -> splitLine(line));
    }
    
    private static void splitLine(String line) {
     listElement.add(splitChar("@", line));
    }
    
    
    private static String[] splitChar(String slicedChar, String line) {
     return line.split(slicedChar);
    }
    
    
    public static List<String[]> getListElement() {
        return listElement;
    }


    
    private static List<String> splitValue(String[] table) {
    List<String> valueList = new ArrayList<String>();  
        for (String element : table){
         String[] splited = splitChar(":",element);
         valueList.add(splited[1]);
        }
    return valueList;
    }
    
    }

