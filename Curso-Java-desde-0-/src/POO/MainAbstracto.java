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
public class MainAbstracto {
    public static void main(String[] args) {
        AbstractoPlanta planta = new AbstractoPlanta();
        AbstractoHerbivoro animal = new AbstractoHerbivoro();
        
        planta.alimentarse();
        animal.alimentarse();
    }
}
