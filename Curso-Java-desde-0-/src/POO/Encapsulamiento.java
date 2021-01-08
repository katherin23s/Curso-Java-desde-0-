/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author key_s
 */
public class Encapsulamiento {
    private int edad;
    private String nombre;
    
    //Metodo Setter: Establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodo Getter: Mostramos la edad
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}
