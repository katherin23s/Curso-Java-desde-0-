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
public class CalcularSumaDe3Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 14.- CALCULAR LA SUMA DE TRES CALIFICACIONES
        Scanner entrada =new Scanner(System.in);
        double cal1,cal2,cal3,suma;
        
        System.out.print("Digite las tres calificaciones");
        cal1 = entrada.nextFloat();
        cal2 = entrada.nextDouble();
        cal3 = entrada.nextDouble();
        
        suma = cal1+cal2+cal3;
        
        System.out.println("La suma de las calificaciones es: "+suma+" ");
    }
    
}
