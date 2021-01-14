/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class Principal2 {
    
    
            public static int tiempoHecho(CarreraAtletismo atleta[]){
                int indice=0;
                double tiempos;
                
                tiempos = atleta[0].getTiempo();
                
                for(int i=1; i<atleta.length; i++){
                    if(atleta[i].getTiempo()<tiempos){
                        tiempos = atleta[i].getTiempo();
                       indice = i; 
                    }
                }
                
                return indice;
            }
    
    public static void main(String[] args) {
        int cantidadAtletas;
        String NoAtleta,Nombre;
        int tiempo, indiceTiempo;
        
      
        cantidadAtletas = Integer.parseInt(JOptionPane.showInputDialog("Inserte Numero de participantes"));
        
        CarreraAtletismo atleta[] = new CarreraAtletismo[cantidadAtletas];
        
        for(int i=0; i< atleta.length; i++){
  
            NoAtleta= JOptionPane.showInputDialog("Inserte Numero de empleado: ");
            Nombre = JOptionPane.showInputDialog("Inserte Nombre de participante");
            tiempo = Integer.parseInt(JOptionPane.showInputDialog("Inserte Tiempo Hecho"));
            
            atleta[i] = new CarreraAtletismo(NoAtleta, Nombre, tiempo);
        }
        
           indiceTiempo = tiempoHecho(atleta);
                
           JOptionPane.showMessageDialog(null,"El atleta mas barato es: \n"+atleta[indiceTiempo].ImprimirGanador());
           System.out.println(atleta[indiceTiempo].ImprimirGanador());
        
    }
}
