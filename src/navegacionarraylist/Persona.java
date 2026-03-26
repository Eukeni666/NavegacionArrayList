/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navegacionarraylist;

/**
 *
 * @author e.fresco
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;
    
    public Persona (String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    
    public String getNombre (){
        return nombre;
    }
    public int getEdad (){
        return edad;
    } 
    public String getEmail (){
        return email;
    }
    
    @Override
    public String toString () {
            return this.getNombre() + ", " + this.getEdad() + ", " + this.getEmail();
    }
    
}
