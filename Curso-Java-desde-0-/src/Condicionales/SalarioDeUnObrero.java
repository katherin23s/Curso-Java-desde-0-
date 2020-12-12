/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author key_s
 */
public class SalarioDeUnObrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 22.-SALARIO DE UN OBRERO
        double salario,horasNormales, calculo,horasExtra; 
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Inserte las horas trabajadas"));
         
         if(horasTrabajadas<=40){
             salario= horasTrabajadas * 16;
         JOptionPane.showMessageDialog(null, "Salario"+salario);
         }else{
          calculo= horasTrabajadas-40;
          horasExtra = calculo*20;
          horasNormales= (40*16);
          salario=horasNormales + calculo; 
         JOptionPane.showMessageDialog(null, "Salario"+salario);
         }
    }
    
}
