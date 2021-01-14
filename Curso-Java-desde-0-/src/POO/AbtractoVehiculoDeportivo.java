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
public class AbtractoVehiculoDeportivo extends PolimorfismoVehiculo{
    private int cilindro;

    public AbtractoVehiculoDeportivo(int cilindro, String matricula, String marca, String modelo) {
        super(matricula,marca,modelo);
        this.cilindro = cilindro;
    }

    public int getCilindro() {
        return cilindro;
    }
    
    @Override
    public String mostrarDatos(){
              return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo : "+modelo+"\nCilindro : "+cilindro;
    }
    
}
