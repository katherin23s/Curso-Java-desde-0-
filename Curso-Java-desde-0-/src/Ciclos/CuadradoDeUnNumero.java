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
public class CuadradoDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 30.- CUADRADO DE UN NUMERO
       Scanner entrada =new Scanner(System.in);
       double numero=0, cuadrado;
        System.out.print("Ingresa valores:");
        numero = entrada.nextInt();  
     while(numero>0){  
        
        cuadrado= (double)Math.pow(numero, 2);
        System.out.print(cuadrado);
        
        System.out.print("Ingresa otro valor:");
        numero = entrada.nextInt();  
        }
       
        
        //for(int i; ){}
    }
    
}
