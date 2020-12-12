/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionJava;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class CalcularRaizDeEcuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // RAIZ DE UNA ECUACION
        Scanner entrada =new Scanner(System.in);
        double a,x1,b,c,x2,mitad;
        
        System.out.print("Introduce el valor A: ");
        a = entrada.nextFloat();
        System.out.print("Introduce el valor B: ");
        b = entrada.nextFloat();
        System.out.print("Introduce el valor C: ");
        c = entrada.nextFloat();
        
    
        x1= (-b + (-(2*a*c)/2))/(2*a);
        x2= (b + (-(2*a*c)/2))/(2*a);
        System.out.print("El valor de X es: "+x1);
        System.out.print("El valor de X es: "+x2);
    }
    
}
