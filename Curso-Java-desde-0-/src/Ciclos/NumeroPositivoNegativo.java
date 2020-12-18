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
public class NumeroPositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 30.- NUMERO POSITIVO NEGATIVO
        Scanner entrada=new Scanner(System.in);
         System.out.print("Ingresa numero  ");
        int numero = entrada.nextInt();
        
        while(numero!=0){
            if(numero >0){
            System.out.print(numero+"Es posiivo  ");
            }else{
             System.out.print(numero+"Es negativo  ");
            }
             System.out.print("Otro numero  ");
             numero = entrada.nextInt();
        }
       
    }
    
}
