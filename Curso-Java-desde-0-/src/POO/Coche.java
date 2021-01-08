/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author key_s
 */
public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodo main
    public static void main(String [] args){
        //Creamos nuestro objeto
        Coche coche1 = new Coche();
        
        //Llenamos al objeto coche todos los atributos
        coche1.color = "blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche 1 es:"+coche1.color);
        System.out.println("La marca del coche 1 es:"+coche1.marca);
        System.out.println("El kilometraje del coche 1 es:"+coche1.km);
        
        Coche coche2 = new Coche();
        coche2.color="Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("El color del coche 1 es:"+coche2.color);
        System.out.println("La marca del coche 1 es:"+coche2.marca);
        System.out.println("El kilometraje del coche 1 es:"+coche2.km);
    }
}
