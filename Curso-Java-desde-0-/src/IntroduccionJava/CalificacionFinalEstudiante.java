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
public class CalificacionFinalEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CALIFICACION FINAL ESTUDIANTE
        Scanner entrada = new Scanner(System.in);
        double cal1, cal2,cal3,cal4, promedio;
        
        System.out.print("Inserte las calificaciones: ");
        cal1 = entrada.nextDouble();
        cal2 = entrada.nextDouble();
        cal3 = entrada.nextDouble();
        cal4 = entrada.nextDouble();
        
        promedio = ((cal1+cal2+cal3+cal4)*100)/400;
        
        System.out.print(promedio);
    }
    
}
