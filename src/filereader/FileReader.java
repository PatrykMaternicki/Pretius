/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import filereader.Service.FileStreamService;

/**
 *
 * @author User
 */
public class FileReader {
    
    String fileName = "plik_z_danymi.txt";
    private FileStreamService fileService = new FileStreamService(fileName);
    public static void main(String[] args) {
    fileService.read();
       
    
    }
}
