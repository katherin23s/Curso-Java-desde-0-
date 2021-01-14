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
public class CarreraAtletismo {
    //Atletismo
    private String NoAtleta;
    private String Nombre;
    private int tiempo;

    public CarreraAtletismo(String NoAtleta, String Nombre, int tiempo) {
        this.NoAtleta = NoAtleta;
        this.Nombre = Nombre;
        this.tiempo = tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }
    
    public String ImprimirGanador(){
     return "El ganador es el atleta numero: "+NoAtleta+"\n Con el nombre : "+Nombre+"\n Con un tiempo de: "+tiempo;  
    }
    
    }

