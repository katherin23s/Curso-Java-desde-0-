/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class Imprimir5numerosArregloInverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IMPRIMIR EN ORDEN 5 NÚMEROS DE UN ARREGLO INVERTIDO.
        Scanner entrada=new Scanner(System.in);
        int[] array=new int[5];
        
        for(int i=0; i<5; i++){
        System.out.print("Introduce valor: ");
        array[i]= entrada.nextInt();
        }
        
        for(int i=5; i>0; i--){
         System.out.println("El valor del arreglo es: "+i);
        }
    }
    
}
