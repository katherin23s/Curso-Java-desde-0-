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
public class MatrizDiagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MATRIZ DIAGONAL 1 - 0
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int fila=7, col=7, uno=6, dos=0;
        
       /* fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Filas"));
        col = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Columnas"));*/
        
        matriz = new int[7][7];
        
      /*  for(int i=0; i<fila; i++){
            for(int j=0; j<col; j++){
                System.out.println("Ingresa numero ["+i+"]["+j+"]");
                matriz[i][j] = entrada.nextInt();
            }
        }*/
        
        if(fila==7 && col==7){
            
          for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
               // System.out.println(" ["+i+"]["+j+"]");
                
                matriz[i][j]=0;
                matriz[i][uno] = 1;              
            }
           uno--;
        }  
          
          
           /*  for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
               // System.out.println(" ["+i+"]["+j+"]");
                
               // matriz[i][j]=0;
                matriz[i][uno] = 1;              
            }
            uno--;
        }
        }*/
        
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                 System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
        
    } 
}
