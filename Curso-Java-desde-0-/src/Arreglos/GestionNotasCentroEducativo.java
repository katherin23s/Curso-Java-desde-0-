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
public class GestionNotasCentroEducativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // GESTION DE NOTAS DE UN CENTRO EDUCATIVO
        Scanner entrada=new Scanner(System.in);
        double primerTrimestreNota=0, segundoTrimestreNota=0,tercerTrimestreNota=0, sumaGrupo=0, sumaAlumnos=0,notaMediaGrupo=0, notaMediaAlumno=0, mediaAlumno=0;
        double [] alumnos =new double[5];
        
         double [] alumnosPrimerTrimestre =new double[4];
         
         double [] alumnosSegundoTrimestre =new double[4];
          
         double [] alumnosTercerTrimestre =new double[4];
        double suma1=0, suma2=0, suma4=0;
        double media1=0, media2=0, media3=0;
        int n=0; 
         
        for(int i=0; i<5; i++){
        System.out.print("Introduce nota primeer trimestre: ");
        primerTrimestreNota = entrada.nextInt();
        System.out.print("Introduce nota segundo trimestre: ");
        segundoTrimestreNota = entrada.nextInt();
        System.out.print("Introduce nota tercer trimestre: ");   
        tercerTrimestreNota = entrada.nextInt();
        
        
        //Primer trimestre
        suma1 += primerTrimestreNota;
        // alumnosPrimerTrimestre[i]=primerTrimestreNota;
        
        //Segundo trimestre
       // alumnosSegundoTrimestre[i]=segundoTrimestreNota;
        suma2 += segundoTrimestreNota;
        //Tercer trimestre
        //alumnosTercerTrimestre[i]=tercerTrimestreNota;
        suma4 += tercerTrimestreNota;
        
        
        
        System.out.print("La mediana del grupo es: ");
        sumaAlumnos= primerTrimestreNota+segundoTrimestreNota+tercerTrimestreNota;
        notaMediaAlumno=sumaAlumnos/3;
        alumnos[i]=notaMediaAlumno;
        }
        
        //Media por trimestre
        media1=suma1/5;
        media2=suma2/5;
        media3=suma4/3;

        System.out.println("La media del grupo por trimestre");
        System.out.println("Primer Trimestre"+media1);
        System.out.println("Segundo Trimestre"+media2);
        System.out.println("Tercer trimestre"+media3);
        
        System.out.print("dame el valor de n alumno para saber su media");
        n= entrada.nextInt();
        System.out.println("La media del alumno N es: "+alumnos[n]);
        
        
    }
    
}
