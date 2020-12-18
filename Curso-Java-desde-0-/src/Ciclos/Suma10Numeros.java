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
public class Suma10Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CALCULAR SUMA DE DIEZ NUMEROS
        Scanner entrada=new Scanner(System.in);
        int num=0;
        int sum=0;
        
      for(int i=1; i<=10; i ++){
        System.out.print("Ingresa numero: ");
        num= entrada.nextInt();
        sum +=num;
      }
      
       System.out.print("La suma es: "+sum);
    }
    
}
