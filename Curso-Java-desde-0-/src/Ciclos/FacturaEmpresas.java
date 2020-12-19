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
public class FacturaEmpresas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 38.- RESUMEN DE VENTAS DE UNA EMPRESA
        Scanner entrada=new Scanner(System.in);
        int codigo, litros,conteoMas600=0, litrosArticulo1 =0;
        float precioLitro, importeFactura, facturacionTotal=0;
        
        for(int i =0; i<=5; i++){
            System.out.print("Ingresa codigo: ");
            codigo = entrada.nextInt();
            System.out.print("Ingresa litros: ");
            litros = entrada.nextInt();
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
        
        System.out.print("Resumen de ventas");
        System.out.print("Facturacion Total: "+facturacionTotal);
        System.out.print("Cantidad en litros de articulos vendidos"+litrosArticulo1);
        System.out.print("Cantidad de facturs mayores a $600: "+conteoMas600);   
    }
    
}
