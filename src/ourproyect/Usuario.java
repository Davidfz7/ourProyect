/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ourproyect;

/**
 *
 * @author david
 */
public class Usuario {
    String nombre, pais;
    
    
    public Usuario(String name, String country){
        this.nombre = name;
        this.pais = country;
    
    }
    
    public void mostrarDatos(){
       System.out.println("Mi nombre es "+this.nombre);
    }
}