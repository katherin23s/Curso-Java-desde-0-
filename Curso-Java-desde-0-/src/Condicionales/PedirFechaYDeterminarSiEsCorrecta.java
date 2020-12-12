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
public class PedirFechaYDeterminarSiEsCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PEDIR FECHA AÑO, MES Y DIA , DETRMINAR SI ES CORRECTA
        int año = Integer.parseInt(JOptionPane.showInputDialog("Año"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
        
        if(año<=2020 && año>0){
        JOptionPane.showMessageDialog(null, "Año Existe");
        }else{JOptionPane.showMessageDialog(null, "Año No Existe"); }
        
         if(mes<=12 && mes>0){
        JOptionPane.showMessageDialog(null, "Mes Existe");
        }else{JOptionPane.showMessageDialog(null, "Mes No Existe"); }
          
            if(dia<=30 && dia>1){
        JOptionPane.showMessageDialog(null, "dia Existe");
        }else{JOptionPane.showMessageDialog(null, "dia No Existe"); }
    }
    
}
