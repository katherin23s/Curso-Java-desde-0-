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
public class SobrecargaMetodo {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Metodos

    public SobrecargaMetodo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public SobrecargaMetodo(String dni) {
        this.dni = dni;
    }
    
    public void correr(double km){
        System.out.println("Soy"+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corrido"+km+" kilometros");
    }
}
 