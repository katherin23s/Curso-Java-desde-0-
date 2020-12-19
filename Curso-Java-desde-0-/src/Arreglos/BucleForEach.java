/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author key_s
 */
public class BucleForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // BUCLE FOREACH
        String [] nombres={"Alejandro","Maria","Luisa","Juan","Narcisa","Luis","roberto","flor","Jessica"};
        //cuando no sabemos cuantos valores tiene el arreglo .lenght
        
        for(int i=0; i<nombres.length; i++){
        System.out.print(nombres[i]);
        }
        //se va a copiar en mi iterador I todos mis nombres.
        for(String i:nombres){
            System.out.println(i);
        }
    }
    
}
