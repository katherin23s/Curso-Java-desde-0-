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
public class SumaDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 32.- SUMA DE NUMEROS
        Scanner entrada = new Scanner(System.in);
        int suma=0;
         System.out.print("Ingresa numero");
        int numero = entrada.nextInt();
        
        do{
            suma =suma+numero;
             System.out.print("El numero tiene valor de: "+suma);
        System.out.print("Ingresa otro numero");
        numero = entrada.nextInt();
        }while(numero!=0);
    }
    
}
