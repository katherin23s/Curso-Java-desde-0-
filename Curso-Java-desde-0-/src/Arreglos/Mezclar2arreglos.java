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
public class Mezclar2arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 46.- MEZCLAR 2 ARREGLOS
        Scanner entrada=new Scanner(System.in);
        int[] tabla1=new int[10];
        int[] tabla2=new int[10];
        int[] tabla3=new int[10];
        int  tabla11=0, tabla22=0,contador1=0, contador2=0;       
    
  /*  System.out.print("Que tabla quieres?");
    tabla11= entrada.nextInt();  
    System.out.print("Que tabla 2 quieres?");
    tabla22= entrada.nextInt();*/
        
    //Creacion y guardado de tablas de multiplicar
    for(int i =0; i<10; i++){
    System.out.print("Escribe el numero para la tabla1");
    tabla1[i]= entrada.nextInt();
    System.out.print("Escribe el numero para la tabla2");
    tabla2[i]= entrada.nextInt();
  
    }
    
       for(int i =0; i<10; i++){
       System.out.print("La tabla1"+tabla1[i]);
       }
      for(int i =0; i<10; i++){
       System.out.print("La tabla2"+tabla2[i]);
       }
      
       for(int i =0; i<10; i++){
           
           if(i==0){
           contador1++;
           tabla3[i]=tabla1[contador1];
           }else if(i %2==0){
           contador1++;
           tabla3[i]=tabla1[contador1];
           }else if(i%2 !=0){
               contador2++;
                tabla3[i]=tabla1[contador2];
           }}
      
 for(int i: tabla3){
   System.out.print("La tabla2"+tabla3[i]);
 }
 

       }
       
       
    
    
}
