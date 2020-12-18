/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 32.- ADIVINAR UN NUMERO ALEATORIO
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingresa un numero:");
    double num = entrada.nextInt();
      double randomDouble=0;
      int contador=0;
      
     
   // for(int i =0; i<=100; i++){
    
       randomDouble = (int)(Math.random() * 100) + 1; 
    // System.out.println("Random Number in Java: " + randomDouble);
  //  }
    
    
    
        while(num != randomDouble){
            if(num>randomDouble){
                 System.out.print("El numero es mayor"+randomDouble);
            }else{
                 System.out.print("El numero es menor"+randomDouble);
            }
            contador++;
            System.out.print("El numero de intentos es de: "+contador);
            
             System.out.print("Ingresa un numero:");
             num = entrada.nextInt();
        }
         System.out.print("El numero de intentos fue: "+contador);
    }
    
}
