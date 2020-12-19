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
public class Imprimir5numerosArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 44.-IMPRIMIR EN ORDEN 5 NÚMEROS DE UN ARREGLO.
        int[] arreglo=new int[5];
        Scanner entrada=new Scanner(System.in);
      
        
        for(int i=0; i<=4; i++){
        System.out.print("Introduce valor: ");
        arreglo[i]=entrada.nextInt();
        System.out.println(arreglo[i]);
        }
        
        for(int i:arreglo){
            System.out.println("valor"+i);
        }
    }
    
}
