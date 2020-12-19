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
public class ModificacionFacturaEmpresas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // RESUMEN DE VENTAS DE UNA EMPRESA
        Scanner entrada=new Scanner(System.in);
        int codigo,conteoMas600=0, litrosArticulo1 =0;
        float precioLitro, importeFactura, facturacionTotal=0;
        double litros=0;
        System.out.print("Ingresa los precios: ");
        System.out.print("1.- 0.6 Litro");
        System.out.print("2.- 3 Litro");
        System.out.print("3.- 1.25 Litro");
        
        int opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
        //1- 0,6 $/litros
            for(int i =0; i<=5; i++){
            System.out.print("Ingresa codigo: ");
            codigo = entrada.nextInt();
           // System.out.print("Ingresa litros: ");
            litros = 0.6;
            System.out.print("Precio litros: ");
            precioLitro = entrada.nextFloat();
            
            importeFactura = (float)litros*precioLitro;
            facturacionTotal += importeFactura;
            
            if(codigo ==1){
                litrosArticulo1 += litros;
            }
            
            if(importeFactura>600){
            conteoMas600++;
            }
        }
                break;
            case 2:
                
                for(int i =0; i<=5; i++){
            System.out.print("Ingresa codigo: ");
            codigo = entrada.nextInt();
           // System.out.print("Ingresa litros: ");
            litros = 3;
            System.out.print("Precio litros: ");
            precioLitro = entrada.nextFloat();
            
            importeFactura = (float)litros*precioLitro;
            facturacionTotal += importeFactura;
            
            if(codigo ==1){
                litrosArticulo1 += litros;
            }
            
            if(importeFactura>600){
            conteoMas600++;
            }
        }  
                
                
                break;
            case 3:
                           for(int i =0; i<=5; i++){
            System.out.print("Ingresa codigo: ");
            codigo = entrada.nextInt();
           // System.out.print("Ingresa litros: ");
            litros =  1.23;
            System.out.print("Precio litros: ");
            precioLitro = entrada.nextFloat();
            
            importeFactura = (float)litros*precioLitro;
            facturacionTotal += importeFactura;
            
            if(codigo ==1){
                litrosArticulo1 += litros;
            }
            
            if(importeFactura>600){
            conteoMas600++;
            }
        }                      
                break;
            default:
                System.out.print("Escoge otra opcion");
                break;
        }

        
        System.out.print("Resumen de ventas");
        System.out.print("Facturacion Total: "+facturacionTotal);
        System.out.print("Cantidad en litros de articulos vendidos"+litrosArticulo1);
        System.out.print("Cantidad de facturs mayores a $600: "+conteoMas600);   
    }
    
}
