
package POO;

public class MainPolimorfismo {
   public static void main(String[] args){
       PolimorfismoVehiculo misvehiculos[]= new PolimorfismoVehiculo[4];
       misvehiculos[0] = new PolimorfismoVehiculo("GH67","Ferrari", "A89");
       misvehiculos[1]= new PolimorfismoVehiculoTurismo(4,"78HJ","Audi","P14");
       misvehiculos[2]= new AbtractoVehiculoDeportivo(34, "8374", "Toyota", "P15");
       misvehiculos[3] = new PolimorfismoFuroneta(3000,"JI8", "Bullsbagen","J9");
       
       for(PolimorfismoVehiculo miVehiculo: misvehiculos){
           System.out.println(miVehiculo.mostrarDatos());
           System.out.println("");
       }
   } 
}
