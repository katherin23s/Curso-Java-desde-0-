/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class SepararNumerosParesEImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 50.-SEPARAR LOS NÚMEROS PARES E IMPARES DE UN ARREGLO
        Scanner entrada = new Scanner(System.in);
        int[] arreglo=new int[10];
        int[] par=new int[10];
        int[] impar=new int[10];
        int contadorPar=0, contadorImpar=0;
        
        //Ingresar valores
        for(int i=0; i<=9; i++){
        System.out.print("Ingresa valor");
        arreglo[i] = entrada.nextInt();
        
        if(arreglo[i]%2==0){
        par[contadorPar] = arreglo[i];
         contadorPar++;
        }else{
        impar[contadorImpar]= arreglo[i];
        contadorImpar++;
        }
       
        }
        
        System.out.print("El arreglo Normal");
        for(int i=0; i<=9; i++){
        System.out.println(arreglo[i]); 
        }
       
        System.out.print("El arreglo par");
        for(int i=0; i<=9; i++){
        System.out.println(par[i]); 
        }

        System.out.print("El arreglo Impar");
         for(int i=0; i<=9; i++){
        System.out.println(impar[i]); 
        }
       
        
    }
    
}
