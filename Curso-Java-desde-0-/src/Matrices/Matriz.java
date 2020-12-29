/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.- MATRIZ hay dos formas de declararlas
       // int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
       Scanner entrada = new Scanner(System.in);
       int matriz[][],nFilas,nCol; 
       nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
       nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
       
       matriz = new int[nFilas][nCol];
       
       System.out.println("Digite la matriz: ");
       for(int i=0; i<nFilas; i++){
           for(int j=0; j<nCol; j++){
               System.out.print("Matriz ["+i+"]["+j+"]: ");
               matriz[i][j] = entrada.nextInt();
           }
       }
       
       System.out.println("La matriz es: ");
        for(int i=0; i<nFilas; i++){//numero de filas
            for(int j=0; j<nCol; j++){ //numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
