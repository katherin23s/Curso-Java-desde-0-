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
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 28.- CICLOS DO WHILE
        Scanner entrada = new Scanner(System.in);
        int i=1, contador;
        System.out.print("Digite la cantidad de terminos:");
        contador = entrada.nextInt();
        do{
            System.out.print(i);
            i+=3;
        }while(i<=contador);
    }
    
}
