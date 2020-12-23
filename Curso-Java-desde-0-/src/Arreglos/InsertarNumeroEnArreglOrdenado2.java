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
public class InsertarNumeroEnArreglOrdenado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 49.-INSERTAR UN NÚMERO EN UN ARREGLO ORDENADO
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10];
        boolean creciente=true;
        int numero=0, sitio_num=0, j=0;
        
        System.out.println("Llenar arreglo");
        
        do{
            //llenando el arreglo
            for(int i=0; i<5; i++){
                System.out.print((i+1)+"Digite un numero: ");
                arreglo[i]=entrada.nextInt();
            }
            //comprobar si el arreglo esta ordenado en orden creciente
            for(int i=0; i<4; i++){
                if(arreglo[i] <arreglo[i+1]){ //creciente 1-2-3
                }
                if(arreglo[i]>arreglo[i+1]){ //decreciente
                    creciente=false;
                break;
                }
            }
            if(creciente ==false){
            System.out.println("El arreglo no esta ordenado en forma creciente, vuelva a digitar.");
            }
        }while(creciente == false);
        
        System.out.print("Digite un elemento a insertar: ");
        numero= entrada.nextInt();
        
        //Esto es para darnos cuenta en que posicion va el numero
        while(arreglo[j]<numero && j<5){
            sitio_num++;
            j++;
        }
        //Por ultimo, transladamos una posicin en el arreglo a los elementos que van detras de un numero
        for(int i=4; i>=sitio_num; i--){
            arreglo[i+1] = arreglo[i];
        }
        //insertamos el numero que el usuario puso
        arreglo[sitio_num]= numero;
        System.out.print("El arreglo queda:");
        for(int i=0; i<6; i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
    
}
