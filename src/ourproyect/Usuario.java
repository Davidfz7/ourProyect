/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ourproyect;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author david
 */
public class Usuario {
    String nombre, password;
    
    
    public Usuario(String name, String password){
        this.nombre = name;
        this.password = password;
    
    }
    
    public void mostrarDatos(){
       JOptionPane.showMessageDialog(null, "Mi nombre es: " +this.nombre);
    }
}