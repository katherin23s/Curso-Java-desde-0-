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
public class LetraMayusculaMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DETERMINAR SI UNA LETRA ES MAYUSCULA O MINUSCULA
        char letra;
        letra = JOptionPane.showInputDialog(null,"Digita Letra").charAt(0);
        if(Character.isUpperCase(letra)){
        JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }else{
         JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
    
}
