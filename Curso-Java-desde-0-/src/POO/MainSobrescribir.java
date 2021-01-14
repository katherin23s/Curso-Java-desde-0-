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
public class MainSobrescribir {
    public static void main(String[] args) {
        SobrescrituraPersona persona = new SobrescrituraPersona();
        SobrescrituraPerro perro = new SobrescrituraPerro();
        persona.comer();
        perro.comer();
    }
}
