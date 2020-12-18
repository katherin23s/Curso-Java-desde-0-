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
public class MostrarNumerosDel1AN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MOSTRAR NUMEROS DE 1 A N
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero");
        int numero = entrada.nextInt();
        
        for(int i = 0; i<=numero;i++){
        System.out.print(i);
        }
    }
    
}
