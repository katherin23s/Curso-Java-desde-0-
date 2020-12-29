/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

1 1 1 1 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 1 1 1 1
 */
package Matrices;

/**
 *
 * @author key_s
 */
public class MatrizMarco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 59.- HACER UNA MATRIZ MARCO CON 1 Y 0
        int matriz[][] = new int[5][5];
        
        //Rellenando la matriz
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==0 || i==4){
                    matriz[i][j] =1;
                } 
                else if(j==0 || j==4){
                    matriz[i][j]=1;
                }
                else{
                    matriz[i][j] =0;
                }
            }
        }
    }
    
}
