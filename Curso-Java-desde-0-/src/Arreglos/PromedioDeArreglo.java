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
public class PromedioDeArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 45.- PROMEDIOS EN UN ARREGLO
        Scanner entrada=new Scanner(System.in);
        int[] arreglo=new int[5];
        int contadorCero=0, numPositivos=0, numNegativos=0;
        double suma1=0,suma2=0,media1=0,media2=0;
        
        for(int i=0; i<5; i++){
        System.out.print("Introduzca numero");
        arreglo[i] = entrada.nextInt();
        
        if(arreglo[i]>0){
        suma1+=arreglo[i];
        numPositivos++;
        }else if(arreglo[i]<0){    
        suma2+=arreglo[i];
        numNegativos++;
        }else if(arreglo[i]== 0){
        contadorCero++;
        }
        }
        media1=(suma1)/numPositivos;
        media2=(suma2)/numNegativos;
        
        if(numPositivos==0){
          System.out.print("Nel perro");
        }else{
         System.out.print("La media de los numeros positivos"+media1);
        }
        if(numNegativos==0){
          System.out.print("Nel perro");
        }else{
               System.out.print("La media de los numeros negativos"+media2);
        }
        
        if(contadorCero==0){
          System.out.print("Nel perro");
        }else{System.out.print("Cantidad de ceros"+contadorCero);}
    }
    
}
