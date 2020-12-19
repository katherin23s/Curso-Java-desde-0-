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
public class AlumnosAprobadosCondicionadosSuspensos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //39.- CONTAR ALUMNOS APROBADOS, SUSPENSOS Y CONDICIONADOS
        Scanner entrada = new Scanner(System.in);
        int nota, aprobados=0, condicionados=0,suspensos=0;
        
        for(int i=0; i<=6; i++){
        System.out.print("Escribe Nota: ");
        nota = entrada.nextInt();
        if(nota>=5 && nota<=10){
        aprobados++;
        }else if(nota==4){
        condicionados++;
        }else if(nota<4 && nota>0)
            suspensos++;
        }
        
        System.out.print("Aprobados: "+aprobados);
        System.out.print("Condicionados: "+condicionados);
        System.out.print("Suspensos: "+suspensos);
    }
 
}
