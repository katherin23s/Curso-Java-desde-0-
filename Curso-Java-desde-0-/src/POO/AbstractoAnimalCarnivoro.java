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
public class AbstractoAnimalCarnivoro extends AbstractoAnimal{
    @Override
    public void alimentarse(){
        System.out.println("El animal carnivoro se alimenta de carne");
    }
}
