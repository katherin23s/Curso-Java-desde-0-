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
public class EliminarElementosSinDejarHuecos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ELIMINAR ELEMENTO SITUADO EN UNA POSICION DADA SIN DEJAR HUECOS
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int posicion=0;
        //Llenar arreglo con 10 elementos
        for(int i=0; i<=9; i++){
          System.out.print("Ingresa valor");
         arreglo[i]= entrada.nextInt();
        }
        
        System.out.print("Eliga la posicion del numero a eliminar");
        posicion = entrada.nextInt();
        while(posicion>9){
         posicion = entrada.nextInt();
        }

           //Por ultimo, transladamos una posicion en el arreglo a los elementos que van detras de un numero
        for(int i=posicion; i<=8; i++){
            arreglo[i] = arreglo[i+1];
        }
        arreglo[9] = 0;
        
          for(int i=0; i<10; i++){
            System.out.println(arreglo[i]);
        }
    }
    
}
