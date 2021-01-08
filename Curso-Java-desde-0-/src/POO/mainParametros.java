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
public class mainParametros {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
        
        parametrosYArgumentos op = new parametrosYArgumentos();
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        
        op.mostrarResultados();
    }
}
