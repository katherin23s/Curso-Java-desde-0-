/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HALLAR LA MATRIZ TRANSPUESTA
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        System.out.println("Digite la matriz");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz["+i+"]["+j+"]:");
                matriz[i][j]= entrada.nextInt();
            }
        }
        
        System.out.println("La matriz original: ");
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Transponiendo la matriz
        int aux;
        for(int i=0; i<3; i++){
            for(int j=0; j<i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i]= aux;
            }
        }
        
        System.out.println("La matriz transpuesta es: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
