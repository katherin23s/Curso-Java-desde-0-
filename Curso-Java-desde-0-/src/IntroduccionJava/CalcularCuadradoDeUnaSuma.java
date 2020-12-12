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
public class CalcularCuadradoDeUnaSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CUADRADO DE UNA SUMA
        Scanner entrada = new Scanner(System.in);
        double a,b,respuesta,respuesta2;
        
        System.out.print("Ingresa primer valor: ");
        a= entrada.nextFloat();
        System.out.print("Ingresa segundo valor: ");
        b= entrada.nextFloat();
        
        respuesta = Math.pow(a,2)+ Math.pow(b,2);
        respuesta2 = respuesta+ 2*(a)*(b);
        
        System.out.print("La respuesta es: "+respuesta2);
    }
    
}
