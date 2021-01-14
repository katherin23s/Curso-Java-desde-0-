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
public class SobrescrituraPersona extends SobrescrituraAnimal{
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
