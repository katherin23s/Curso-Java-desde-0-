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
public class CalcularSemanasDiasHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CALCULAR SEMANAS DIAS HORAS
        Scanner entrada = new Scanner(System.in);
        double horas,semanas,dias,calculoSemana, calculoDias;
        System.out.print("Introduce la cantidad de horas:");
        horas = entrada.nextInt();
        
        calculoSemana = (horas)/168;
        calculoDias = (horas)/24;
        
        System.out.print("Semanas"+calculoSemana);
        System.out.print("Semanas"+calculoDias);
        System.out.print("Semanas"+horas);
    }
    
}
