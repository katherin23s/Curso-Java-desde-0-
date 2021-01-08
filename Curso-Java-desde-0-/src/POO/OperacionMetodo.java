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
public class OperacionMetodo {
    //Atributos 
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    
    
    //Metodos
    
    //Metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
    }
    
    //Metodo para sumar ambos numeros
    public void sumar(){
        suma = numero1 + numero2;
    }
    
    //Metodo para restar ambos numeros
    public void restar(){
        resta = numero1 - numero2;
    }
    
     //Metodo para restar ambos numeros
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    
     //Metodo para restar ambos numeros
    public void dividir(){
        division = numero1 / numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
