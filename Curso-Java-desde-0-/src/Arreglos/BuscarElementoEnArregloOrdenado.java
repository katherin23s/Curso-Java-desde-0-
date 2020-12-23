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
public class BuscarElementoEnArregloOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 51.- BUSCAR UN ELEMENTO EN UN ARREGLO ORDENADO
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce arreglo");
        int[] arreglo = new int[10];
        boolean creciente=true, posicionIgual=true;
        int n=0;
        
          do{
            //llenando el arreglo
            for(int i=0; i<10; i++){
                System.out.print((i+1)+"Digite un numero: ");
                arreglo[i]=entrada.nextInt();
            }
            //comprobar si el arreglo esta ordenado en orden creciente
            for(int i=0; i<9; i++){
                if(arreglo[i] <arreglo[i+1]){ //creciente 1-2-3
                     creciente=true;
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
          
          System.out.print("Ingresa valor N: ");
          n= entrada.nextInt();
        do{  
          
          for(int i=0; i<10; i++){
          if(arreglo[i]==n){
          System.out.print("La posicion es: "+i);
          posicionIgual=true;
          break;
          }else{
          posicionIgual=false;
          }
          if(i==9 && posicionIgual==false){
          System.out.print("No existe el numero ");
           break;
          }
          }
        }while(posicionIgual==false);
                  
          
    }
    
}
