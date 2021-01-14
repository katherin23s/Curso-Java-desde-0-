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
public class PolimorfismoFuroneta extends PolimorfismoVehiculo{
    private int carga;

    public PolimorfismoFuroneta(int carga, String matricula, String marca, String modelo) {
        super(matricula,marca,modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    public String mostrarDatos(){
    return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo : "+modelo+"\nCarga : "+carga;
    }
}
