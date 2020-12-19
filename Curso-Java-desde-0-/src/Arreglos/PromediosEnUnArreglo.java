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
public class PromediosEnUnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 45.- PROMEDIOS EN UN ARREGLO
        Scanner entrada=new Scanner(System.in);
        int[] arreglo= new int[10];
        int primero=0, ultimo=9;
        for(int i=0; i<10; i++){
        System.out.print("Escribe el numero");
        arreglo[i]= entrada.nextInt();
        }
        
        for(int x=0; x<5; x++){
        System.out.println(arreglo[primero]);
        primero++;
        System.out.println(arreglo[ultimo]);
        ultimo--;
        
        }
    }
    
}
