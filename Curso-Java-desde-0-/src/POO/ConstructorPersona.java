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
public class ConstructorPersona {
    //Atributos
    String nombre;
    int edad;
    
    //Metodos Constructor
    public ConstructorPersona(String _nombre, int _edad){
    //Asignar valor a los atributos
    nombre = _nombre;
    edad = _edad;
    
    //this.nombre = nombre
    //this.edad = edad
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    
}
