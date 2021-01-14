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
public class NumerosComplejosOperaciones {
    private int x;
    private int y;
    private int z;
    
    public NumerosComplejosOperaciones(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int obtenerSuma(){
    int suma = x+y;
        return suma;
    }
    
    public int obtenerResta(){
    int resta = x-y;
    return resta;
    }
    
    public int obtenerMultiplicacion(){
    int multiplicacion = x*y;
    return multiplicacion;
    }
    
    public int multiplicacionEntero(){
    
    int compleXenero= x*z;
    return compleXenero;
    }
    
    public void Resultados(int suma, int resta,int multiplicacion, int mulEntero){
    System.out.println("La suma compleja es: "+suma);
    System.out.println("La resta compleja es:"+resta);
    System.out.println("La multiplicacion compleja es: "+multiplicacion);
    System.out.println("La multiplicacion con entero es: "+mulEntero);
    }
    
}
