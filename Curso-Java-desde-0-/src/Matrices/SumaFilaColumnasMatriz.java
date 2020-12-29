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
public class SumaFilaColumnasMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 58.- SUMAR CADA FILA Y COLUMNA DE UNA MATRIZ
        
        /*
        1 2 3
        4 5 6
        7 8 9
        */
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nFilas; j++){
                System.out.print(matriz[i][j]+" ");
            }
             System.out.println("");
        }
       
        
        //Ahora procederemos a sumar las filas
        for(int i=0; i<nFilas; i++){
            sumaFilas = 0;
            for(int j=0; j<nCol; j++){
                sumaFilas += matriz[i][j];
            }
            System.out.println("La suma de la fila["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        
        //por ultimo sumamos las columnas
        for(int j=0; j< nCol; j++){
            sumaCol=0;
            for(int i=0; i<nFilas; i++){
                sumaCol += matriz[i][j];
            }
            System.out.println("La suma de la columna ["+j+"] es: "+sumaCol);
        }
        System.out.println("");
    }
    
}
