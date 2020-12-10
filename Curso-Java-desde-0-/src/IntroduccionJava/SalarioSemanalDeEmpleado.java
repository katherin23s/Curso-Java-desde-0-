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
public class SalarioSemanalDeEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 14.-SALARIO SEMANAL DE EMPLEADO
        Scanner entrada = new Scanner(System.in);
        double pagoHora,horasTrabajadas, salarioSemanal;
        
        System.out.print("Cuanto ganas por hora?");
        pagoHora = entrada.nextDouble();
        System.out.print("Cuantas horas trabajaste a la semana?");
        horasTrabajadas = entrada.nextDouble();
        
        salarioSemanal = pagoHora*horasTrabajadas;
        
         System.out.print("Cuanto ganas a la semana?"+salarioSemanal);
    }
    
}
