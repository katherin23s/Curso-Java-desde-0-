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
public class OrdenamientoInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ORDENAMIENTO INSERCION
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
        arreglo = new int[nElementos];
        for(int i=0; i<nElementos; i++){
        System.out.println((i+1)+"Digite un numero:");
        arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por Insercion
        for(int i=0; i<nElementos; i++){
            pos=i;
            aux =arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]) >aux){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        
        System.out.print("Orden Ascendente : ");
        for(int i=0; i<nElementos; i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
        
        
        System.out.print("Orden Descendente : ");
        for(int i=nElementos; i>=0; i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
    
}
