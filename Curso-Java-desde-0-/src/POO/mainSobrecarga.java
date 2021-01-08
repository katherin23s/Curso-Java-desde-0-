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
public class mainSobrecarga {
    public static void main(String[] args) {
        //Persona persona1 = new Persona("Katherin",21);
        SobrecargaMetodo persona = new SobrecargaMetodo("Katherin", 24);
        persona.correr(15.7);
        
        SobrecargaMetodo persona2 = new SobrecargaMetodo("12312312");
        persona2.correr(100);
    }
}
