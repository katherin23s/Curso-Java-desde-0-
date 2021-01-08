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
public class EjercicioAreaYperimetroCuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    //Metodos
    
    //Metodo Constructor 1 (Cuadrilatero)
    public EjercicioAreaYperimetroCuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Metodo Constructor 2 (Cuadrado)
    public EjercicioAreaYperimetroCuadrilatero(float lado1) {
        this.lado1 =  this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
    
    public static void main(String[] args) {
        EjercicioAreaYperimetroCuadrilatero c1;
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1 : "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2 : "));
        
        if(lado1 == lado2){
            c1 = new EjercicioAreaYperimetroCuadrilatero(lado1);
        }
        else{
            c1 = new EjercicioAreaYperimetroCuadrilatero(lado1,lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
    
    
}
