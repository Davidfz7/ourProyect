/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ourproyect.Classes;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
/*
 *
 * @author david
 */
public class SignUp {
    
    
    String nombre, password;
    ArrayList<ArrayList<String>> data_base = new ArrayList();
    ArrayList<String> users_names = new ArrayList();
    ArrayList<String> user_password = new ArrayList();
    
    public void mostrarDatos(){
        System.out.println(data_base);
    }
    public void save_data(String name, String password){
        this.nombre = name;
        this.password = password;
        boolean quant = true;
        
        if(users_names.size()>=1){
        for(int i = 0; i<=users_names.size()-1; i++){
            System.out.println(i);
              if(this.nombre.equals(users_names.get(i))){
              JOptionPane.showMessageDialog(null, "Nombre de usuario ya registrado XD");
              quant = false;
              break;
              }
        }
        }
        
        if(quant == true){
        users_names.add(this.nombre);
        user_password.add(this.password);
        JOptionPane.showMessageDialog(null, "\nBienvenido " + this.nombre);
        }
    }
    public void GoBackButton(){
        
        data_base.add(users_names);
        data_base.add(user_password);
        System.out.println(data_base);
       
    
    }
    
}