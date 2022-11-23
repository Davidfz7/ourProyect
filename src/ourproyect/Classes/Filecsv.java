/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ourproyect.Classes;
import com.opencsv.CSVWriter;
import java.io.IOException;
import ourproyect.Classes.Filetxt;

/**
 *
 * @author juli-
 */
public class Filecsv {
    String path = System.getProperty("user.dir")+"/hola.txt";
    Filetxt file = new Filetxt(path);

    public void hola() throws IOException{
        
        System.out.println(file.txtToArray());
        
  }
}