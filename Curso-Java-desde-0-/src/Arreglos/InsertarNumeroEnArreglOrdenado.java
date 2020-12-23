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
public class InsertarNumeroEnArreglOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 49.- INSERTAR UN NÚMERO EN UN ARREGLO ORDENADO
        Scanner entrada=new Scanner(System.in);
        int valor=0;
        int valor_anterior=1;
        boolean bandera=false;
        int[] arreglo =new int[10];
        int[] arregloFinal =new int[10];        
        int insertar=0;
        int n=0, contador=0, contador2=0, contador3=0;
        boolean bandera2=false;
        
        //Insertamos primer valor antes de comparar
        for(int i=0; i<1; i++){
          System.out.print("Insertar  valor en arreglo");
          arreglo[i]=entrada.nextInt();
        }
        
        //Insertamos valores crecientes
        for(int i=1; i<=4; i++){
  
        bandera=false;
        while(bandera==false){
     
            System.out.print("Insertar valor en arreglo");
            valor=entrada.nextInt();
        
            valor_anterior= arreglo[i-1];
            
            if(valor>valor_anterior){
            arreglo[i]=valor;
            bandera=true;
            }
        }
        }
        
        //Valor a insertar
         System.out.print("Digita un numero para insertar");
         insertar = entrada.nextInt();
        
// HASTA AQUI ESTA BIEN
         
        //Recorre el arreglo para saber en donde insertar
        while(bandera2==false){
        if(insertar<arreglo[contador]){
        // arreglo[contador]
         bandera2=true;
        }
        contador++;
        }
         
         int resta = 10-contador;  
         //Guardar valores
           //Guardar en el otro arrego la diferencia 8 vueltas de mayor hasta n
        
        for(int i=arreglo[contador]; i<=9; i++){
        
        arregloFinal[contador2] = arreglo[i];
      //  System.out.print("Num:"+ultimo[contador]);
        contador2++;     
        }
        
         //Contador añadir el valor en la posicion
        arreglo[contador]=insertar;
       
        //Recorremos los valores que estan despues de n
        //Ingresamos los 8 elementos despues de n+1
        for(int i=1; i<resta; i++){
        arreglo[n+i]=arregloFinal[contador2];
     //   System.out.print("Num:"+tabla[n+i]);
        contador2++;
        }
         
         for(int i=0; i<9; i++){
          System.out.println("arreglo"+arreglo[i]);
        }
        
        
      
    }
    
}
