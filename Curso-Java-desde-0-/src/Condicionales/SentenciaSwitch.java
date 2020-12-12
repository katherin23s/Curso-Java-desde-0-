/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class SentenciaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 19.- SENTENCIA SWITCH
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Eigite el numero entre 1 y 5"));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
            break;
            case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
            break;    
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 4");
            break;
            default: JOptionPane.showMessageDialog(null, "No hay opciones");
        }
    }
    
}
