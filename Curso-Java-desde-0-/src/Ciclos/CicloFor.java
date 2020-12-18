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
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CICLO FOR
        /*
            Ciclo for
            for(inicializacion; condicion; aumentoDecremento){
        Instrucciones;}
        */
        Scanner entrada = new Scanner(System.in);
        int contador;
        System.out.print("Digite la cantidad de terminos");
        contador = entrada.nextInt();
        for(int i=1; i<=contador; i++){
            System.out.print(i);
        }
        
         for(int i=10; i>=contador; i--){
            System.out.print(i);
        }
    }
    
}
