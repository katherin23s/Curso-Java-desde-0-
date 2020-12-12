/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author key_s
 */
public class CifrasNumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numero1 = new Random();
        // CIFRAS NUMERO ALEATORIO
        int int_random = numero1.nextInt(999999); 
        JOptionPane.showMessageDialog(null, int_random);
        if(int_random <= 9){ JOptionPane.showMessageDialog(null, "1");
        }else if(int_random <= 99){ JOptionPane.showMessageDialog(null, "2");
        }else if(int_random <= 999){ JOptionPane.showMessageDialog(null, "3");
        }else if(int_random <= 9999){ JOptionPane.showMessageDialog(null, "4");
        }else if(int_random <= 99999){ JOptionPane.showMessageDialog(null, "5");
        }else if(int_random <= 999999){ JOptionPane.showMessageDialog(null, "6");
        }
    }
    
}
