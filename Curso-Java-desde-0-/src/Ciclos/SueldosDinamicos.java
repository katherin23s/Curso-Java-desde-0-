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
public class SueldosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SUELDOS DINAMICOS
        Scanner entrada=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        
        int cantidadSueldos= entrada.nextInt();
        double sueldos, sueldoMayor=0;
        
        for(int i=0; i<=cantidadSueldos; i++){
                       
        System.out.print("Introduce sueldo: ");
        sueldos=entrada.nextDouble();
        if(sueldos>sueldoMayor){
            sueldoMayor=sueldos;
        }
        }
        System.out.print("El sueldo maximo es: "+sueldoMayor);
    }
    
}
