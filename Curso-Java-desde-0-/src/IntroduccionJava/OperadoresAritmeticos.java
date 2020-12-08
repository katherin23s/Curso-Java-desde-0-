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
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8.- OPERADORES ARITMETICOS
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2,suma,resta,multiplicacion, division,resto;
        
        System.out.print("Digite numeros:");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1-numero2;
        multiplicacion = numero1 * numero2;
        division = numero1/numero2;
        resto = numero1%numero2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multimplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El resto es :"+resto);
        
    }
    
}
