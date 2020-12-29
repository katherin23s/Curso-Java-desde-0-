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
public class TranspuestaMatriz5x9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SUMAR CADA FILA Y COLUMNA DE UNA MATRIZ
        
        Scanner entrada = new Scanner(System.in);
        
        int[][] matriz;
        int[][] matriz2;
        int fila,col;
        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cantidad de filas"));
        col = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cantidad de columnas"));
        
        matriz = new int[fila][col];//5 9
        matriz2 = new int[col][fila];
        
        System.out.print("Ingresa datos en matriz");
        
        //Rellenar Matriz por filas
        for(int i=0; i<fila; i++){
            for(int j=0; j<col; j++){
                matriz[i][j] = entrada.nextInt();
               // System.out.print(matriz[i][j]+" ");
            }
           //  System.out.println("");
        }
        
    /*      for(int i=0; i<col; i++){
            for(int j=0; j<fila; j++){
             //  matriz[i][j] = entrada.nextInt();
                System.out.print(matriz[j][i]+" ");
            }
             System.out.println("");
        }*/
        
        
        
        
        //Transponer matriz en la segunda Matriz
        if(fila==5 && col==9){
        
        for(int i=0; i<col; i++){ //9
            for(int j=0; j<fila; j++){ //5
                matriz2[i][j] = matriz[j][i];
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
        
        }
    }
    
}
