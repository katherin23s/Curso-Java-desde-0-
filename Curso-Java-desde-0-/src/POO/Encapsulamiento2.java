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
public class Encapsulamiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Encapsulamiento objeto1 = new Encapsulamiento();
      
      objeto1.setEdad(24);
      System.out.println("La edad es: "+objeto1.getEdad());
      
      objeto1.setNombre("katherin");
      System.out.println("El nombre es: "+objeto1.getNombre());
    }
    
}
