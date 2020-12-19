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
public class LosMejoresSueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PEDIR 10 SUELDOS , MOSTRAR LA SUMA Y CUANTOS HAY MAYORES DE 1000;
        Scanner entrada=new Scanner(System.in);
        double suma=0, mayores=0, sueldo=0;
        
        for(int i=1; i<=10; i++){
        System.out.print("Introduce el sueldo: ");
        sueldo = entrada.nextInt();
        suma +=sueldo;
        if(sueldo>1000){
        mayores++;
        }
        }
        System.out.print("La suma de los sueldos es: "+suma);
        System.out.print("La cantidad de sueldos mayores a 1000 es: "+mayores);
    }
    
}
