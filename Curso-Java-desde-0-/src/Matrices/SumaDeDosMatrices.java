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
public class SumaDeDosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SUMA DE DOS MATRICES
        Scanner entrada= new Scanner(System.in);
        int fila,col, fila2,col2;
        int[][] matriz;
        int[][] matriz2;
        int[][] suma;
        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Insertar filas de matriz: "));
        col = Integer.parseInt(JOptionPane.showInputDialog("Insertar columnas de matriz: "));
        
        fila2 = Integer.parseInt(JOptionPane.showInputDialog("Insertar filas de matriz: "));
        col2 = Integer.parseInt(JOptionPane.showInputDialog("Insertar columnas de matriz: "));
        
        matriz =new int[fila][col];
        matriz2 =new int[fila2][col2];
        
        suma =new int[3][3];

        System.out.println("Digite una matriz: ");
        for(int i=0; i<fila; i++){
            for(int j=0; j<col; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]= entrada.nextInt();            
            }
        }
        
        
        System.out.println("Digite otra matriz: ");
        for(int i=0; i<fila; i++){
            for(int j=0; j<col; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz2[i][j]= entrada.nextInt();            
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
            
                suma[i][j]=matriz[i][j]+matriz2[i][j];
                System.out.println(suma[i][j]);
            }
        }
   
}
}
