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
public class SentenciaIFELSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 18.- SENTENCIA IF ELSE
        //Dependiendo si esta isntruccion es verdadero o falso se ejecutan instrucciones.
        int numero, dato=5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if(numero == dato){
        JOptionPane.showMessageDialog(null,"El numero es 5");
        }else{
        JOptionPane.showMessageDialog(null,"El numero es diferente de 5");
        }
    }
    
}
