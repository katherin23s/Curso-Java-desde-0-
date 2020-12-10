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
public class SalarioMensualDeUnVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SALARIO MENSUAL DE UN VENDEDOR 
        Scanner entrada=new Scanner(System.in);
        double cantidadDeCarrosVendidos,valorVentaCarro, salarioMensual,cal1,cal2;
        double sumaPrecios=0;
        double cincoPorcientoPorPrecioCarro=0;
        double[]precio = new double[10];
        
        
        System.out.print("Cuantos carros ha vendido?");
        cantidadDeCarrosVendidos = entrada.nextFloat();
        
        for(int x=0; x<cantidadDeCarrosVendidos; x++){
        System.out.print("Escriba el precio de cada uno:");
        precio[x] = entrada.nextFloat();
        cincoPorcientoPorPrecioCarro += precio[x];
        }
        
        cal1 = cantidadDeCarrosVendidos *150;
        cal2 =cincoPorcientoPorPrecioCarro*(0.5);
        
        salarioMensual = 1000+ cal1+cal2;
        System.out.print("Comision por carro vendido: "+cal1);
        System.out.print("Comision por precio del carro vendido: "+cal2);
        System.out.print("El salario del empleado es: "+salarioMensual);
    }
    
}
