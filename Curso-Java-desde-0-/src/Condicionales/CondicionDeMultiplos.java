/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class CondicionDeMultiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 20.- CONDICION DE MULTIPLOS
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(10%numero == 0){
             System.out.print("Es multiplo de 10");
        }else{
             System.out.print("No es multiplo de 10");
        }
    }
    
}
