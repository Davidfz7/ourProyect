/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ourproyect.Classes;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.nio.file.Files;

public class Filetxt {
    String pathName = null;
    FileWriter theFile = null;
   
    
public Filetxt(String pathName){
      this.pathName = pathName; 
    }
public void writeData(String userName, String userPassword) throws IOException
{
        File verifyFile = new File(this.pathName);
        BufferedWriter theFile = null;
        BufferedReader readingFile_toCheck = new BufferedReader(new FileReader(this.pathName));
        if(verifyFile.exists() == true){ 
           if(readingFile_toCheck.readLine() == null){
                theFile = new BufferedWriter(new FileWriter(this.pathName)); 
                System.out.println("El archivo estaba null");
                theFile.write(userName+","+userPassword+",");
                theFile.close();
                
           
           }else{
                theFile = new BufferedWriter(new FileWriter(this.pathName, true));
                System.out.println("Entre donde era");
                theFile.write(userName+","+userPassword+",");
                theFile.close();
           }
             
;

        }else{
                createFile();
        }

        }   

private void createFile() throws IOException
{
         //Esto no sirve xd´nt?
    FileWriter theFile = new FileWriter(this.pathName);
                
}
 
public  ArrayList<ArrayList> txtToArray() throws FileNotFoundException, IOException{
                String data_into_array = null;
                String variableY = null;
                String variableX = null;
                ArrayList<ArrayList> info_complete = new ArrayList<>();
                String[] AllData = null;
                ArrayList<String> Users = new ArrayList<>();
                ArrayList<String> Passwords = new ArrayList<>();
                BufferedReader readingFile_toConvert = new BufferedReader(new FileReader(this.pathName));
                data_into_array = readingFile_toConvert.readLine();
                variableY = data_into_array;
                AllData = data_into_array.split(",");
                variableX = variableY;
                while(data_into_array != null)
                {   
                    
                    data_into_array = readingFile_toConvert.readLine();
                    if(data_into_array != null)
                    {
                    
                    variableX += data_into_array;
                    System.out.println(variableX);
                    
                    }else if(data_into_array == null){
                        AllData = variableX.split(",");
                        break;
                    }
                    
                }
                readingFile_toConvert.close();
                ArrayList<String> data_inArray = new ArrayList<String>(Arrays.asList(AllData));
                for(int i =0; i<data_inArray.size();i++){
                    if(i%2 == 0){
                        Users.add(data_inArray.get(i));
                    }
                    else{
                        Passwords.add(data_inArray.get(i));
                    }
                }
                info_complete.add(Users);
                info_complete.add(Passwords);
               
                return info_complete;      
     }
}