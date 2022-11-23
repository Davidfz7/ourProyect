/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ourproyect.Classes;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Filetxt {
    String pathName = null;
    FileWriter theFile = null;
    String data_into_array = null;
    String[] AllData = null;
    ArrayList<String> Users = new ArrayList<>();
    ArrayList<String> Passwords = new ArrayList<>();
    
    Filetxt(String pathName){
      this.pathName = pathName; 
    }
    public void writeData(String userName, String userPassword) throws IOException{
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

     public void createFile() throws IOException{
                FileWriter theFile = new FileWriter(this.pathName);
    }
     
     
     public  ArrayList<String> txtToArray() throws FileNotFoundException, IOException{
                BufferedReader readingFile_toConvert = new BufferedReader(new FileReader(this.pathName));
                data_into_array = readingFile_toConvert.readLine();
                AllData = data_into_array.split(",");
                ArrayList<String> data_inArray = new ArrayList<String>(Arrays.asList(AllData));
                for(int i =0; i<data_inArray.size();i++){
                    if(i%2 == 0){
                        Users.add(data_inArray.get(i));
                    }
                    else{
                        Passwords.add(data_inArray.get(i));
                    }
                }
                System.out.print("La de usuarios"+ Users);
                System.out.print("\nlas contras"+ Passwords);
                return data_inArray;
            
     }
}