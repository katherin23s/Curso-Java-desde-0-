/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Scanner;


public class MainTriangulo {
   
    
            //Area con Mayor superficie
          public static int AreaMayorSuperficie(EjercicioAreaPerimetroTriangulo triangulos[]){
              int indice=0;
              double areaMayor;
              areaMayor = triangulos[0].obtenerArea();
              for(int i=0; i<triangulos.length; i++){
                  if(triangulos[i].obtenerArea()>areaMayor){
                  areaMayor = triangulos[i].obtenerArea();
                  indice=i;
                          }
              }
           return indice; 
            }

        
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int ntriangulos;
        int indiceMayor;
        
        System.out.print("Digite el numero de triangulo a ingrsar: ");
        ntriangulos = entrada.nextInt();
        
        EjercicioAreaPerimetroTriangulo triangulos[] = new EjercicioAreaPerimetroTriangulo[ntriangulos];
        for(int i=0; i<ntriangulos; i++){
            System.out.println("\nDigite los valores para el triangulo"+(i+1)+":");
            System.out.println("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.println("Introduzca el lado: ");
            lado= entrada.nextDouble();
            //Creacion de arreglo de objetos
            triangulos[i] = new EjercicioAreaPerimetroTriangulo(base, lado);
        }
        //Porque no se le pone el corchete???
        indiceMayor = AreaMayorSuperficie(triangulos);
        System.out.println("El perimetro del triangulo es: "+triangulos[indiceMayor].obtenerPerimetro());
          System.out.println("El area del tiangulo mayor es: "+triangulos[indiceMayor].obtenerArea());
            System.out.println("Los resulatados son: "+triangulos[indiceMayor].mostrarDatos());
        
    }
}
