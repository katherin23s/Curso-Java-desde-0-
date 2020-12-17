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
public class Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NOTA DEL 0 AL 10
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la nota"));
        
        if(nota>=1 || nota <=10){
        
            if(nota== 6){
            JOptionPane.showMessageDialog(null,"Insuficiente");
            } else if(nota== 7){
             JOptionPane.showMessageDialog(null,"suficiente");
            }else if(nota== 8){
             JOptionPane.showMessageDialog(null,"Bien");
            }else if(nota== 9){
             JOptionPane.showMessageDialog(null,"Notable");
            }else if(nota== 10){
             JOptionPane.showMessageDialog(null,"Sobresaliente");
            }else{
             JOptionPane.showMessageDialog(null,"Reprobado");
            }
           
        }
    }
    
}
