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
public class FusionDeDosArreglosOrdenadosCrecientemente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FUSION DE DOS ARREGLOS ORDENADOS CRECIENTEMENTE
        Scanner entrada= new Scanner(System.in);
        int[] arreglo = new int[20];
        int[] arreglo1 = new int[20];
        int[] arreglo2 = new int[20];
      //  int[] arreglo2 = new int[10]; 
         boolean creciente=true,creciente2=true, creciente3=true;
        int contadorA1=0, contadorA2=0;
      //INSETAR EN EL ARREGLO NUMEROS CRECIENTES
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
       
       
       
       //INSETAR EN EL ARREGLO1 NUMEROS CRECIENTES
       do{
            //llenando el arreglo
            for(int i=0; i<10; i++){
                System.out.print((i+1)+"Digite un numero: ");
                arreglo1[i]=entrada.nextInt();
            }
            //comprobar si el arreglo esta ordenado en orden creciente
            for(int i=0; i<9; i++){
                if(arreglo1[i] <arreglo1[i+1]){ //creciente 1-2-3
                       creciente2=true;
                }
                if(arreglo1[i]>arreglo1[i+1]){ //decreciente
                    creciente2=false;
                break;
                }
            }
            if(creciente2 ==false){
            System.out.println("El arreglo no esta ordenado en forma creciente, vuelva a digitar.");
            }
        }while(creciente2 == false);
        
       for(int i=0; i<19; i++){
            //INSERTAR EN ARREGLO3 NUEMEROS CRECIENTES 
               System.out.println("holaa"+arreglo[contadorA1]+"que pasa"+arreglo1[contadorA2]);
            if(arreglo[contadorA1]<arreglo1[contadorA2] || arreglo[contadorA1]<10){          
            //En arreglo 3 se introduce el valor
            arreglo2[i]=arreglo[contadorA1];
            contadorA1++;
            }else{
            //En arreglo 3 se introduce el valor
            arreglo2[i]=arreglo1[contadorA2];
                contadorA2++;
            System.out.print("holaa");
            }
       }
       
      for(int i=0; i<19; i++){
      System.out.print("num : "+arreglo2[i]);
      }
      
 
     //  contadorA1
       
     /*         do{
            //llenando el arreglo
            for(int i=0; i<=19; i++){
                System.out.print((i+1)+"Digite un numero: ");
                arreglo2[i]=entrada.nextInt();
            }
            //comprobar si el arreglo esta ordenado en orden creciente
            for(int i=0; i<=9; i++){
                if(arreglo2[i] <arreglo2[i+1]){ //creciente 1-2-3
                }
                if(arreglo2[i]>arreglo2[i+1]){ //decreciente
                    creciente3=false;
                break;
                }
            }
            if(creciente3 ==false){
            System.out.println("El arreglo no esta ordenado en forma creciente, vuelva a digitar.");
            }
        }while(creciente3 == false);
        
        for(int i=0; i<=9; i++){
        System.out.println("jiji"+arreglo[i]);
        System.out.println("jiji"+arreglo1[i]);
        }*/
              
              
    }
    
}
