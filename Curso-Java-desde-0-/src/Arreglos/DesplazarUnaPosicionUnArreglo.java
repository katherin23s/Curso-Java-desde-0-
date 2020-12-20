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
public class DesplazarUnaPosicionUnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DESPLAZAR UNA POSICIÓN EN UN ARREGLO
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        System.out.print("Llenar el arreglo");
        for(int i=0; i<10; i++){
        System.out.println("Digite un numero");
        arreglo[i]= entrada.nextInt();
        }
        
        ultimo = arreglo[9];//Guardamos el ultimo elemento
        for(int i=8; i>=0;i--){//Avanzar una posicion abajo del arreglo
        arreglo[i+1]=arreglo[i];
        }
        
        arreglo[0]=ultimo;//Ponemos el ultimo elemento como primero
        System.out.print("El nuevo elemento es: ");
        
        for(int i=0; i<10; i++){
        System.out.print("Numero: "+arreglo[i]);
        }
        
    }
    
}
