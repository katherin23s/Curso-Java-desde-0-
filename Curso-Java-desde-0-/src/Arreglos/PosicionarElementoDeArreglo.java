/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class PosicionarElementoDeArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ARREGLO EN FORMA CRECIENTE O DECRECIENTE
        Scanner entrada = new Scanner(System.in);
        int[] tabla =new int[10];
        int[]ultimo=new int[10];
        int n=0;
        int resta=0;
        int numero=0;
        int contador=0;
        int contador2=0;
      //  int posicion;
        
        //Rellenamos la tabla
        System.out.print("Llenar el arreglo");
        for(int i=0; i<8; i++){
        System.out.println("Digite un numero");
        tabla[i]= entrada.nextInt();
        }
        System.out.print("El numero a introducir es: ");
        numero= entrada.nextInt();
        
        System.out.print("La posicion es: ");
        n=entrada.nextInt();
        
        resta=10-n;
        
        int limite=resta-1;
       // int nLimite= n-1;
        //Guardar en el otro arrego la diferencia 8 vueltas de mayor hasta n
        
        for(int i=n; i<=9; i++){
        
        ultimo[contador] = tabla[i];
      //  System.out.print("Num:"+ultimo[contador]);
        contador++;
      
        }
        //Contador añadir el valor en la posicion
        tabla[n]=numero;
       
        //Recorremos los valores que estan despues de n
        //Ingresamos los 8 elementos despues de n+1
        for(int i=1; i<resta; i++){
        tabla[n+i]=ultimo[contador2];
     //   System.out.print("Num:"+tabla[n+i]);
        contador2++;
        }
        
        
        for(int i=0; i<10; i++){
        System.out.print("Num:"+tabla[i]);
         //contador++;
        }
    }
    
}
