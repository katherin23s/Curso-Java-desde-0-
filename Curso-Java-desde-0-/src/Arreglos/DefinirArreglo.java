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
public class DefinirArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DEFINICION ARREGLOS
        int [] numeros = new int[3];
        numeros[0]=7;
        numeros[1]=10;
        numeros[2]=13;
        
        System.out.print(numeros[2]);
        for(int i=0; i<3; i++){
        System.out.print(numeros[i]);
        }
    }
    
}
