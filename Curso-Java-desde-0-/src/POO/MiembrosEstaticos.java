/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author key_s
 */
public class MiembrosEstaticos {

    private static String frase2 = "Frase estatica";
    //ATRIBUTO ESTATICO
    private String frase = "Primera frase";
    //METODO ESTATICO
    public static int sumar(int n1,int n2){
        int suma=n1+n2;
        return suma;
    }
    
    
    public static void main(String[] args) {
        // MIEMBROS ESTÁTICOS DE UNA CLASE
        MiembrosEstaticos ob1 = new MiembrosEstaticos();
        MiembrosEstaticos ob2 = new MiembrosEstaticos();
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);       
        //Impresion de atributo estatico
        System.out.println(MiembrosEstaticos.frase2);
        //Impresion de metodo estatico
        System.out.println("La suma es: "+MiembrosEstaticos.sumar(3, 4));  
         
    }
    
}
