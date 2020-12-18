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
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 27.-CICLO WHILE
        Scanner entrada = new Scanner(System.in);
        int i=1, contador;
        
        System.out.print("Digite cuantos numeros quiere");
        contador = entrada.nextInt();
        while(i<=contador){
        System.out.print(i);
        i+=2;
        }
        
    }
    
}
