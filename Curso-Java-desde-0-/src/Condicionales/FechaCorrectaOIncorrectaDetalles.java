/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class FechaCorrectaOIncorrectaDetalles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FECHAS CORRECTAS O INCORRECTAS
                // PEDIR FECHA AÑO, MES Y DIA , DETRMINAR SI ES CORRECTA
        int año = Integer.parseInt(JOptionPane.showInputDialog("Año"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
        
        
        if(dia <=31 && dia >=1){
            
            if(mes==2 && dia<=28){       
                if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 1 && dia<=31 && dia>=1){           
                   if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes ==3 && dia <=31 && dia>=1){      
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            } else if(mes == 4 && dia <=30 && dia>=1){  
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 5 && dia <=31 && dia>=1){
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 6 && dia <=30 && dia>=1){         
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 7 && dia <=31 && dia>=1){
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 8 && dia <=31 && dia>=1){      
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 9 && dia <=30 && dia>=1){    
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 10 && dia <=31 && dia>=1){
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 11 && dia <=30 && dia>=1){
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }else if(mes == 12 && dia <=31 && dia>=1){   
             if(año <=2021 && año >=1){
                     JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }else{
                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
                }
            }
        }else{
          JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
        
        
       /* if(mes <=31 && mes >=1){
            
        }
        
        if(año <=31 && año >=1){
            
        }*/
         
     /*   if(dia<=31 && dia>=1){
              if(mes<=12 && mes<=1){ 
                
        //Evaluacion      
        //Evalua los meses que tienen 30 dias
         if((dia <= 30 && mes == 4) || (dia <= 30 && mes == 6) || (dia <= 30 && mes == 9) || (dia <= 30 && mes == 11)){
           if(año<=2020 && año>=1){
           JOptionPane.showMessageDialog(null,"Fecha correcta");
            }else{  JOptionPane.showMessageDialog(null,"Fecha Incorrecta");}
          //Evalua los meses que tienen 31 dias
         }else if((dia <= 31 && mes == 1) || (dia <= 31 && mes == 3) || (dia <= 31 && mes == 7) || (dia <= 31 && mes == 8) || (dia <= 31 && mes == 10) || (dia <= 31 && mes == 12)){
            if(año<=2020 && año>=1){
           JOptionPane.showMessageDialog(null,"Fecha correcta");
            }else{  JOptionPane.showMessageDialog(null,"Fecha Incorrecta");}
         }else if(dia <= 28 && mes == 2){
           if(año<=2020 && año>=1){
           JOptionPane.showMessageDialog(null,"Fecha correcta");
             }else{  JOptionPane.showMessageDialog(null,"Fecha Incorrecta");}
         }else{
         JOptionPane.showMessageDialog(null,"Fecha Incorrecta");
         }
        
         }
         
         }                            
               
        */
        
    /*    if(dia == 28 && mes == 2){
           JOptionPane.showInputDialog("Fecha correcta");}
        
        //Evalua los meses que tienen 30 dias
         if((dia == 30 && mes == 4) || (dia == 30 && mes == 6) || (dia == 30 && mes == 9) || (dia == 30 && mes == 11)){
          
         }else{
          JOptionPane.showInputDialog("Fecha Incorrecta");
         }
         
         //Evalua los meses que tienen 31 dias
           if((dia == 31 && mes == 1) || (dia == 31 && mes == 3) || (dia == 31 && mes == 7) || (dia == 31 && mes == 8) || (dia == 31 && mes == 10) || (dia == 31 && mes == 12)){
          
         }else{
          JOptionPane.showInputDialog("Fecha Incorrecta");
         }
         */
         
    }
    
}
