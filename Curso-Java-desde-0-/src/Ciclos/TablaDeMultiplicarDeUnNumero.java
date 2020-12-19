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
public class TablaDeMultiplicarDeUnNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TABLA DE MULTIPLICAR DE UN NUMERO
        Scanner entrada=new Scanner(System.in);
       double tabla=0;
        double aleatorio= Math.random()*10;
        
        for(int i=1; i<=10; i++){
            tabla=aleatorio*i;
              System.out.print(aleatorio+"   ");
            System.out.print("L tabla es: "+i+" x "+aleatorio+" = "+tabla);
        }
    }
    
}
