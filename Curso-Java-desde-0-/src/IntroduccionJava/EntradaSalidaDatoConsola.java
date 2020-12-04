/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionJava;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class EntradaSalidaDatoConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6.- ENTRADA Y SALIDA DE DATOS POR CONSOLA
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        Double valor;
        String valorTexto;
        
        System.out.println("Digite el valor");
        valor = entrada.nextDouble();
        
        System.out.println("Digita el valor");
        valorTexto = entrada2.nextLine();
        
        System.out.println("El valor es : "+valor);
        System.out.println(valorTexto);
    }
    
}
