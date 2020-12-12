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
public class NumeroParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NUMERO PAR O IMPAR
    
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Num1"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Num2"));
        if(num1%2 ==0 && num2%2==0){
            JOptionPane.showMessageDialog(null,"Pares");
        }else if(num1%2 !=0 && num2%2==0){ JOptionPane.showMessageDialog(null,"Num1 Impar Num2 Par");}
        else if(num1%2 ==0 && num2%2!=0){JOptionPane.showMessageDialog(null,"Num1 Par Num2 Impar");}
        else if(num1%2 !=0 && num2%2!=0){JOptionPane.showMessageDialog(null,"Impares");}
    }
    
}
