/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionJava;

/**
 *
 * @author key_s
 */
public class OperadorIncrementoYDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OPERADOR DE INCREMENTO Y DECREMENTO
        int x=5, y, z,g;
        g = x++;
        y = x++;
        z = ++x;
        System.out.print("los valores son"+g+y+z);
    
     //   System.out.print("los valores son"+x+y+z);
    }
    
}
