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
public class MovimientoObjeto2 {
    public static void main(String[] args) {
        int valor1,valor2, valor3;
        String valor4;
       
        MovimientoObjeto obj1;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa segundo valor"));
        
        obj1=new MovimientoObjeto(valor1,valor2);
        
        do{
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion.. 1.-Arriba, 2.-Abajo, 3.-Izquierda, 4.-Derecha"));
        
        switch(valor3){
            case 1:
                //Arriba
                obj1.arriba();
                System.out.println("Pasos arriba"+obj1.y);
                break;
            case 2:
                  //Abajo
                obj1.abajo();
                System.out.println("Pasos abajo"+obj1.y);
                break;
            case 3:
                  //Izquierda
                obj1.izquierda();
                System.out.println("Pasos izquierda"+obj1.x);
                break;
            case 4:    
                  //Derecha
                obj1.derecha();
                System.out.println("Pasos derecha"+obj1.x);
                break;
            default:
                  System.out.println("Salir del programa");
                break;
                
        
        }
        
        valor4 = JOptionPane.showInputDialog("Desea hacer otro Movimiento pulsar [S]");       
        }while(valor4=="S");
        
        
    }
}
