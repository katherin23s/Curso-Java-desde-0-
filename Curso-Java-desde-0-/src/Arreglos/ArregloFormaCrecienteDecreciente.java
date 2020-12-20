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
public class ArregloFormaCrecienteDecreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ARREGLO EN FORMA CRECIENTE O DECRECIENTE
        Scanner entrada=new Scanner(System.in);
        int[] arreglo=new int[10];
        //Para distinguir que opcion se cumple
        boolean creciente=true,decreciente=true,desordenado=true,iguales=true; 
        
        int anterior=0,despues=1,despuesDespues=2;
        
        //Llenar los valores del arreglo
        for(int i=0; i<10; i++){
        System.out.print("Introduce los valores del arreglo: ");
        arreglo[i] = entrada.nextInt();
        }
        
        //Por cada iteracion me va a ir preguntando si se cumple o no
        for(int i=0; i<8; i++){
         
            //Creciente
            if(arreglo[anterior]<arreglo[despues] && arreglo[despues]< arreglo[despuesDespues]){
            }else{
            creciente=false;
            }
            //Decreciente
            if(arreglo[anterior]>arreglo[despues] && arreglo[despues]> arreglo[despuesDespues]){
            }else{
            decreciente=false;
            }
            //Iguales
            if(arreglo[anterior]== arreglo[despues] && arreglo[despues]== arreglo[despuesDespues]){
            }else{
            iguales=false;
            }
            //Desiguales
            if(creciente==true){
               desordenado=false;
            }else if(decreciente==true){
                desordenado=false;
            }else if(iguales==true){
                desordenado=false;
            }else{desordenado=true;}
            
         anterior++;
         despues++;
         despuesDespues++;
        }
        
              if(creciente==true){
                 System.out.print("El arreglo es creciente");
            }else if(decreciente==true){
                 System.out.print("El arreglo es decreciente");
              
            }else if(iguales==true){
               System.out.print("El arreglo es igual");
            }else if (desordenado=true){
            System.out.print("El arreglo es desordenado");
            }
     
        
    }
    
}
