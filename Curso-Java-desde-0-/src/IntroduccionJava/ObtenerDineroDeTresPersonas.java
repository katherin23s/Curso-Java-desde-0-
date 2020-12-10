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
public class ObtenerDineroDeTresPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OBTENER DINERO DE TRES PERSONAS
        Scanner entrada =new Scanner(System.in);
        float salarioGuillermo, salarioLuis, salarioJuan,total;
        
        System.out.print("El salario de Guillermo es: ");
        salarioGuillermo = entrada.nextFloat();
        
        salarioLuis = (salarioGuillermo)/2;
        
        salarioJuan = (salarioGuillermo+salarioLuis)/2;
        
        total = salarioGuillermo+salarioLuis+salarioJuan;
        
        System.out.print("El salario de c/u es: "+salarioGuillermo+" "+salarioLuis+" "+salarioJuan+" "+total);
    }
    
}
