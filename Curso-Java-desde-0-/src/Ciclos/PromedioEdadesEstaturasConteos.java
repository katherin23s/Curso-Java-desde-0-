/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class PromedioEdadesEstaturasConteos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //37.-PROMEDIO DE EDADES ESTATURAS Y CONTEOS
        Scanner entrada=new Scanner(System.in);
        int edad=0;
        double estatura=0, sumaEdades=0, sumaEstatura=0, cantidadAlumnosMayores=0, cantidadAlumnosEstatura=0,media1=0, media2=0;
        
        for(int i=1; i<=5; i++){
        System.out.print("Ingresa Edad: ");
        edad= entrada.nextInt();
        System.out.print("Ingresa Estatura: ");
        estatura= entrada.nextDouble();
        
        sumaEdades+=edad;
        sumaEstatura+=estatura;
        
        if(edad>=18){
        cantidadAlumnosMayores++;
        }
        if(estatura>=1.75){
        cantidadAlumnosEstatura++;
        }
        }
        media1= sumaEdades/5;
        media2= sumaEstatura/5;
        
        System.out.print("La media de edad es: "+media1);
        System.out.print("La media de altura es: "+media2);
        System.out.print("Alumnos mayores a 18: "+cantidadAlumnosMayores);
        System.out.print("La estatura de alumnos mayor a 1.75 es: "+cantidadAlumnosEstatura);
    }
    
}
