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
public class ProductoNumeroImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PRODUCTOS DE NUMEROS IMPARES
    //    Scanner entrada=new Scanner(System.in);
        int numero = 0;
        long producto = 1;
        int total = 0;
      //  System.out.print("Ingresa numero: ");
     //    numero = entrada.nextInt();
   
      
      for(int i=1; i<=20; i+=2){
      //  while(numero%2!=0){
        producto *= i;
      //  System.out.print("Ingresa otro numero: ");
      //  numero = entrada.nextInt();
       //  }
      }
         System.out.print("El producto es: "+producto);
    }
}
