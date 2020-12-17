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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 25.- CALCULADORA
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa num1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa num2"));
        int resultado=0;
        char opcion;
        opcion = JOptionPane.showInputDialog("Escoge operacion (S) Suma, (R) Resta, (M) Multiplicaion , (D) Division").charAt(0);
        
        switch(opcion){
            case 's':
                resultado = num1 + num2;
                break;
            case 'r':
                 resultado = num1 - num2;
                break;
            case 'm':
                  resultado = num1 * num2;
                break;
            case 'd':
                  resultado = num1 / num2;
                break;
            default:
                JOptionPane.showMessageDialog(null, num2);
                break;
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
