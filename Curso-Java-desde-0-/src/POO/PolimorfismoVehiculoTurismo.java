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
public class PolimorfismoVehiculoTurismo extends PolimorfismoVehiculo{
    private int nPuertas;
    
    public PolimorfismoVehiculoTurismo(int nPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
         return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo : "+modelo+"\nPuertas : "+nPuertas;
    }
}
