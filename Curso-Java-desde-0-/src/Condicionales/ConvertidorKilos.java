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
public class ConvertidorKilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONVERTIDOR DE KILOS
        
        double pesoKilos = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso en kilogramos"));
        double conversion=0;
        String tipo="";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion"));
        
        switch(opcion){
            case 1:
                conversion = pesoKilos*1000;
                tipo="gramos";
                break;
            case 2:
                 conversion = pesoKilos*1000000;
                 tipo="miligramos";
                break;
            case 3:
                 conversion = pesoKilos*2.20462;
                 tipo="Libras";
                break;
            case 4:
                conversion = pesoKilos*0.001;
                tipo="toneladas";
                break;
        }
        
        JOptionPane.showMessageDialog(null, "La conversion es de kiloas a : "+tipo+" "+conversion);
    }
    
    
    
}
