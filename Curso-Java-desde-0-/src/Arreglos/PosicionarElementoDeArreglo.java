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
public class PosicionarElementoDeArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ARREGLO EN FORMA CRECIENTE O DECRECIENTE
        Scanner entrada = new Scanner(System.in);
        int[] tabla =new int[10];
        int[]ultimo=new int[10];
        int n=0;
        int resta=0;
        int numero=0;
        int contador=0;
      //  int posicion;
        
        //Rellenamos la tabla
        System.out.print("Llenar el arreglo");
        for(int i=0; i<10; i++){
        System.out.println("Digite un numero");
        tabla[i]= entrada.nextInt();
        }
        System.out.print("El numero a introducir es: ");
        numero= entrada.nextInt();
        
        System.out.print("La posicion es: ");
        n=entrada.nextInt();
        
        resta=8-n;
        
        int valor;
         //Guardar los elementos a recorrer 8-3
        for(int i=7; i>=n; i--){
        ultimo[contador]=tabla[i];
        contador++;
        } 
        

      //Avanzar n posicion abajo del arreglo
        //recorre los restantes elementos n posiciones
        for(int i=resta; i>=0;i--){
        tabla[i+n]=tabla[i];
        //System.out.print("Numero: "+ tabla[i+n]);
        valor=i+n+1;
        
        System.out.println("Numero: "+  tabla[i+n]);
        }
        
        
       /*for(int i=0; i<8; i++){
        System.out.print("Numero: "+ultimo[i]);
        }*/
        
        //Se asigna a tabla el valor de numero
        tabla[n]=numero;
        
        
          //Avanzar n posicion abajo del arreglo
        //recorre los restantes elementos n posiciones
        for(int i=resta; i>=0;i--){
        //Llenando al revez los valores
            tabla[i+n+1]=tabla[i];
        }
   
      /*  for(int i=0; i<n; i++){
        tabla[i]=ultimo[i];
        }*/
        
         System.out.print("El nuevo elemento es: ");
         
          for(int i=0; i<8; i++){
        System.out.print("Numero: "+tabla[i]);
        }
        
       
    }
    
}
