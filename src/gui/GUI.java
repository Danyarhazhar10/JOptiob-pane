
package gui;

import javax.swing.JOptionPane;


public class GUI {

    public static void main(String[] args) {
      
      String a;
      
      a=JOptionPane.showInputDialog(null,"Enter an integer");
      int w=Integer.parseInt(a);
      if(w%2==0){
          JOptionPane.showMessageDialog(null,"the number is even");
         
      }
      
     if (w%2==1){
          JOptionPane.showMessageDialog(null,"the number is odd");
     }
     
     JOptionPane.showConfirmDialog(null,"DO another");
     
     
     
     
     
            
      
      
        
        
        
        
        
            }
    
    }
