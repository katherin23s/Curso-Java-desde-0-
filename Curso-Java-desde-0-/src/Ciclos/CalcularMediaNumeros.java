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
public class CalcularMediaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 33.- CALCULAR LA MEDIA DE NUMEROS
        Scanner entrada = new Scanner(System.in);
            System.out.print("Introduzca numero: ");
        int numero = entrada.nextInt();
        int suma=0;
        float media=0;
        int n=0;
        while(numero>0){
        suma +=numero;
        System.out.print("La suma es: "+suma);
        System.out.print("Introduzca otro numero: ");
        n++;
        numero = entrada.nextInt();
        }
        media = (suma)/n;
         System.out.print("La media es "+media);
    }
    
}
