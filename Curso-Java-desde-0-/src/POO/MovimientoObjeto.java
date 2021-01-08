/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

public class MovimientoObjeto {
    //Atributos
    int x;
    int y;
    
    //Metodo Constructor

    public MovimientoObjeto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //Metodos
    public void arriba(){
        y +=y;
        System.out.println("Arriba");
    }
    
    public void abajo(){
        y-=y;
         System.out.println("Abajo");
    }
    
     public void izquierda(){
         x-=x;
          System.out.println("Izquierda");
    }
     
     public void derecha(){
         x+=x;
           System.out.println("Derecha");
    }
    
}
