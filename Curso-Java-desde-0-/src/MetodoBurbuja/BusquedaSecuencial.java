/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoBurbuja;

import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 54.-BUSQUEDA SEGUENCIAL
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        //Busqueda Secuencial
        int i=0;
        while(i<5 && band==false){
            if(arreglo[i]== dato){
                band=true;
            }
            i++;
        }
        
        if(band ==false){
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el arreglo: ");
        }else{
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion:"+(i-1));
        }
    }
    
}
