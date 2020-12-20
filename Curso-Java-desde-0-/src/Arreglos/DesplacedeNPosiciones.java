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
public class DesplacedeNPosiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DESPLACE DE N POSICIONES
        Scanner entrada=new Scanner(System.in);
        int[]arreglo=new int[10];
        int[]ultimo=new int[10];
        int n;
        int resta=0;
        int contador=0;
        
        System.out.print("Llenar el arreglo");
        for(int i=0; i<10; i++){
        System.out.println("Digite un numero");
        arreglo[i]= entrada.nextInt();
        }
        
        System.out.print("Elige la cantidad de posiciones a recorrer: ");
        n=entrada.nextInt();
        //elementos a guardar
        resta=9-n;
        
        //Guardar los elementos a recorrer
        for(int i=9; i>=n; i--){
        ultimo[contador]=arreglo[i];
        contador++;
        } 
        
        //Avanzar n posicion abajo del arreglo
        //recorre los restantes elementos n posiciones
        for(int i=resta; i>=0;i--){
        arreglo[i+n]=arreglo[i];
        }
        
        for(int i=0; i<n; i++){
        arreglo[i]=ultimo[i];
        }
        
         System.out.print("El nuevo elemento es: ");
         
          for(int i=0; i<9; i++){
        System.out.print("Numero: "+arreglo[i]);
        }
    }
    
}
