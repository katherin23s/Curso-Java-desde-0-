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
public class Herencia2 extends Herencia1{
    //Clase hija
    private int codigoRstudiante;
    private float notaFinal;
    
    public Herencia2(String nombre, String apellido, int edad, float notaFinal){
        super(nombre,apellido,edad);
        this.codigoRstudiante = codigoRstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "
                +getApellido()+"\nEdad: "+getEdad()
        +"\nCodigo Estudiante: "+codigoRstudiante+"\nNota Final: "+notaFinal);
    }
}
