
package POO;

import java.util.Scanner;
public class MainComplejo {

    public static void main(String[] args) {
            int x=0;
            int y=0;
            int z=0;
        
         Scanner entrada = new Scanner(System.in);
         
            System.out.println("Ingrese valor complejo 1:");
            x = x;
        
            System.out.println("Ingrese valor complejo 2:");
            y = y;
            
            System.out.println("Ingrese valor complejo por entero");
            z= entrada.nextInt();
            
            NumerosComplejosOperaciones complejo = new NumerosComplejosOperaciones(x, y,z);
         
         int suma=   complejo.obtenerSuma();
         int resta=   complejo.obtenerResta();
         int multiplicacion=   complejo.obtenerMultiplicacion();                     
         int multEntero=   complejo.multiplicacionEntero();
            
          complejo.Resultados(suma,resta,multiplicacion,multEntero);
            
    }
}
