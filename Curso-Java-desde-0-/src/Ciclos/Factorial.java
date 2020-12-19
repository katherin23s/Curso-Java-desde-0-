/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FACTORIAL
        Scanner entrada = new Scanner(System.in);
        int numero= entrada.nextInt();
        int num=1;
        int num1=1;
        int factorial=0;
        System.out.print("Ingresa numero");
      
      
        for(int i=1; i<=numero; i++){
         // num1=i;
          //numero = (i);//*(num1-1);
        //  factorial=numero;
          //factorial *=i;
    /*    numero *=numero--;
           System.out.print("Factorial: "+numero);
             System.out.print("num: "+num);*/
   // num=i;
   // num1=num-1;
    num = num*i;
    
      System.out.print("Factorial: "+num);

    
        }
       
    }
    
}
