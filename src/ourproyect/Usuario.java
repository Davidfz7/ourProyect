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
    ArrayList<String> usuarios = new ArrayList();
    
    
    public Usuario(String name, String password){
        this.nombre = name;
        this.password = password;
        usuarios.add(this.nombre);
        usuarios.add(this.password);
    
    }
    
    public void mostrarDatos(){
        System.out.println(usuarios);
    }
}