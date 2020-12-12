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
public class CondicionCompararNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // COMPARAR DOS NUMEROS
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta segundo numero"));
        if(num1 >num2){
           JOptionPane.showMessageDialog(null,"num1 es mayor a num2");
        }else if(num1 < num2){
            JOptionPane.showMessageDialog(null,"num1 es menor a num2");
        }else if(num1 == num2){
         JOptionPane.showMessageDialog(null,"num1 es igual a num2");
        }
    }
    
}
