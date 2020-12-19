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
public class NumeroNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 40.- NUMERO NEGATIVO
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        boolean bandera=false;
        for(int i=0; i<=10; i++){
        System.out.print("Introduce numero: ");
        numero= entrada.nextInt();
        if(numero<0){
        bandera=true;
        }
        }
    if(bandera==true){
    System.out.print("Se ha introducido un numero negativo");
    }
    }
}
