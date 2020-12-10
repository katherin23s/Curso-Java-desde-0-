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
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 11.-CLASE MATH
        
        //Raiz cuadrada
        double raiz = Math.sqrt(9);
        int raiz1 = (int)Math.sqrt(9);
        
        //Potencia
        double resultado = Math.pow(6, 2);
        
        //Redondeo
        double resultado2 = Math.round(4.56);
        
        //Random - aleatorio
        double resultado3 = Math.random();
        
        
        System.out.print(raiz);
        System.out.print(raiz1);
        System.out.print(resultado);
        System.out.print(resultado2);
        System.out.print(resultado3);
    }
    
}
