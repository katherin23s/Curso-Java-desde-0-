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
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 26.- CAJERO AUTOMATICO
        int opcion = 0; 
        int saldo=0;
        int transaccion=0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la opcion: (1) Ingresar Dinero a la cuenta, (2) Retirar dinero de la cuenta, (3) Salir "));
         
         
        
        switch(opcion){
            case 1:
                transaccion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa transaccion"));
                saldo = 1000+transaccion;
                 break;
            case 2:
                transaccion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa transaccion"));
                if(transaccion<=1000 && transaccion>=1){
                saldo = 1000-transaccion;
                }else{
                JOptionPane.showMessageDialog(null, "Lo sentimos usted no puede retirar!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Usted esta cerrando sesion");
                break;
        }
        
        JOptionPane.showMessageDialog(null, "Su saldo final es de: "+saldo);
    }
    
}
