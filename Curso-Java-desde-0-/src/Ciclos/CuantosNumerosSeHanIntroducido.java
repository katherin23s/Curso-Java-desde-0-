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
public class CuantosNumerosSeHanIntroducido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 31.- CUANTOS NUMEROS SE HAN INTRODUCIDO
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa numero");
        int numero = entrada.nextInt();
        int num=0;
        while(numero>0){
         System.out.print(num);
         num++;
         System.out.print("Ingresa numero");
         numero = entrada.nextInt();
        }
    }
    
}
