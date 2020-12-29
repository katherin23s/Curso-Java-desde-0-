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
public class MatrizSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DETERMINAR SI UNA MATRIZ ES SIMÉTRICA O NO
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        boolean simetrica =true;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite una matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]= entrada.nextInt();
            }
        }
        
        if(nFilas == nCol){ //Si el numero de filas es igual al numero de columnas
            int i,j;
            i=0;
            while(i<nFilas && simetrica==true){
                j=0;
                while(j<i && simetrica==true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
            
            if(simetrica==true){
                    JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            }else{
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
        }else{
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
        }
    }
    
}
