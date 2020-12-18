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
public class NumeroParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 31 NUMEROS PARES E IMPARES
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa numero");
        int numero = entrada.nextInt();
        
        while(numero !=0){
            if(numero%2==0){
                System.out.print("Es par");
            }else{
                System.out.print("Es impar");
            }
            System.out.print("Ingresa otro numero");
            numero = entrada.nextInt();
        }
    }
    
}
