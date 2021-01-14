
package POO;

import java.util.Scanner;
public class Principal {
    
   public static int indiceCocheMBarato(EjercicioEncontrarVehiculoMasBarato coches[]){
       float precio;
       int indice=0;
       
       precio = coches[0].getPrecio();
       for(int i=1; i<coches.length; i++){
           if(coches[i].getPrecio() < precio){
               precio = coches[i].getPrecio();
               indice = i;
           }
       }
       return indice;
   }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos,indiceBarato;
        
        System.out.println("Digite la cantidad de Vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        
         EjercicioEncontrarVehiculoMasBarato coches[]  = new EjercicioEncontrarVehiculoMasBarato[numeroVehiculos];
    
    for(int i=0; i<coches.length; i++){
        entrada.nextLine();
        System.out.println("\nDigite las caracteristicas del Coche "+(i+1)+":");
        System.out.print("Introduzca Marca: ");
        marca = entrada.nextLine();
        System.out.print("Introduzca el Modelo: ");
        modelo = entrada.nextLine();
        System.out.print("Introduzca Precio: ");
        precio = entrada.nextFloat();
        
        coches[i] = new EjercicioEncontrarVehiculoMasBarato(marca,modelo,precio);
    }
    
    indiceBarato = indiceCocheMBarato(coches);
    System.out.println("\n El coche mas barato es: ");
    System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
