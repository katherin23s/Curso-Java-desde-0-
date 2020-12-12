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
public class DescuentoDeCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DESCUENTO DE UNA COMPRA
        double descuento,total;
        double compra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de la compra: "));
        if(compra>300){
        descuento = compra*.20;
        total = compra-descuento;
        JOptionPane.showInputDialog(null, "La compra es con descuento"+total);
        }else{
            total=compra;
         JOptionPane.showInputDialog(null, "La compra es sin descuento"+total);
        }
    }
    
}
