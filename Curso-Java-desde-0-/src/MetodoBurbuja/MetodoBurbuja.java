/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoBurbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 52.- METODO BURBUJA
        Scanner entrada = new Scanner(System.in);
        int arreglos[], nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
        arreglos = new int[nElementos]; //le asignamos el numero de elementos al arreglo
        
        //Llenamos el arreglo de elementos
        for(int i =0; i<nElementos; i++){
        System.out.print((i+1)+"Digite un numero: ");
        arreglos[i] = entrada.nextInt();
        }
        
        //Metodo Burbuja
        for(int i=0; i<(nElementos-1); i++){
            for(int j=0; j<(nElementos-1); j++){
                if(arreglos[j]> arreglos[j+1]){ //si numero actual > numero siguiente
                    aux = arreglos[j];
                    arreglos[j] = arreglos[j+1];
                    arreglos[j+1]=aux;
                }
            }
        }
        
        //Mostramos el arreglo ordenado en forma creciente
        System.out.print("Arreglo ordenado de forma creciente: ");
        for(int i=0; i<nElementos; i++){
            System.out.println(arreglos[i]+" - ");
        }
        
        System.out.println("Arreglo ordenado en forma decreciente");
        for(int i=(nElementos-1); i>=0; i--){
            System.out.print(arreglos[i]+" - ");
        }
        
        System.out.print("");
    }
    
}
