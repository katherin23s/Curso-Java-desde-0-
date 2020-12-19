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
public class CalificacionSuspenso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CALIFICACION SUSPENSO
        Scanner entrada =new Scanner(System.in);
        double calificacion=0;
        boolean bandera=false;
        for(int i=1; i<=5; i++){
        System.out.print("Pedir calificacion: ");
        calificacion= entrada.nextDouble();
        if(calificacion<4 && calificacion>0){
        bandera=true;
        }
        }
        if(bandera==true){
            System.out.print("Hay un valor en suspenso");
        }else{
        System.out.print("No Hay un valor en suspenso");
        }
        
    }
    
}
