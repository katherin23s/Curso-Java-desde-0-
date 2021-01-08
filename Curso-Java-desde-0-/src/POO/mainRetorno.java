/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class mainRetorno {
    
    public static void main(String[] args) {
    
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));
        
        retornoValores op = new retornoValores();
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division = op.dividir(n1, n2);
        
        op.mostrarResultados(suma, resta, multiplicacion, division);
    }
    
}
