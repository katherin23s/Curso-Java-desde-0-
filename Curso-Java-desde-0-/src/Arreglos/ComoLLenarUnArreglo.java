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
public class ComoLLenarUnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 42.- LLENAR UN ARREGLO
        Scanner entrada=new Scanner(System.in);
        int nElementos=0;
        System.out.print("Introduce la cantidad de elementos a mostrar : ");
        nElementos = entrada.nextInt();
        
        char[] letras = new char[nElementos];
        System.out.print("Digite los elementos del arreglo: ");
        for(int i=0; i<nElementos; i++){
        System.out.print("Digite un caracter : ");
        letras[i]=entrada.next().charAt(0);
        }
        
        System.out.print("Los caracteres del arreglo son: ");
        for(int i=0; i<nElementos;i++){
        System.out.print(letras[i]+" ");
        }
    }
    
}
