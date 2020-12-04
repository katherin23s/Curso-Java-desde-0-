/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionJava;

import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class EntradaSalidaDatoJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7.- ENTRADA Y SALIDA DE DATOS CON JOPTIONPANE
        
        String cadena;
        int enteros;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digita el valor");
        enteros = Integer.parseInt(JOptionPane.showInputDialog("Digita valor entero:"));
        letra = JOptionPane.showInputDialog("Digita el caracter:").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digita un decumal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es:"+cadena);
        JOptionPane.showMessageDialog(null,"El valor entero es:"+enteros);
        JOptionPane.showMessageDialog(null,"El valor del caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"El valor del decimal es:"+decimal);
 
    }
    
}
