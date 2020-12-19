/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class MediaNumerosNegativosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 36.- CAALCULAR LA MEDIA DE LOS NUMEROS POSITIVOS, NEGATIVOS Y CANTIDAD DE 0
        Scanner entrada =new Scanner(System.in);

        double numero= 0, sum1=0,sum2=0,media1=0,media2=0, contadorCero=0,contadorPositivo=0,contadorNegativo=0;
        
        for(int i=0; i<=10; i++){
           System.out.print("Escribe el numero: ");
           numero= entrada.nextInt();
        
           if(numero>0){
           sum1+=numero;
           contadorPositivo++;
           }else if(numero<0){
           sum2+=numero;
           contadorNegativo++;
           }else if(numero==0){
           contadorCero++;
           
           }
        }
        
        media1=(sum1)/contadorPositivo;
        media2=(sum2)/contadorNegativo;
        
        System.out.print("La media de numeros positivos es: "+media1+" "+"La media de numeros negativos es: "+media2+" "+"La cantidad de 0 es: "+contadorCero);
    }
    
}
