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
public class OrdenarMayorMenorNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ORDENAR 3 NUMEROS DE MAYOR A MENOR
        int n1,n2,n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        
        if((n1>n2) && (n2>n3)){
            JOptionPane.showMessageDialog(null,n1+"-"+n2+"-"+n3);
        }else if((n1>n3) && (n3>n2)){
            JOptionPane.showMessageDialog(null,n1+"-"+n3+"-"+n2);
        }else if((n2>n1) && (n1>n3)){
             JOptionPane.showMessageDialog(null,n2+"-"+n1+"-"+n3);
        }else if((n2>n3)&&(n3>n1)){
        JOptionPane.showMessageDialog(null,n2+"-"+n3+"-"+n2);
        }else if((n3>n1)&&(n1>n2)){
        JOptionPane.showMessageDialog(null,n3+"-"+n1+"-"+n2);
        }else if((n3>n2)&&(n2>n1)){
        JOptionPane.showMessageDialog(null,n3+"-"+n2+"-"+n1);
        }
    }
    
}
