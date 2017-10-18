/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

/**
 *
 * @author nicolas
 */

    public class Conversiones {
  
     /**
      * @param args the command line arguments
      */
    
      public static void main(String[] args) {
         // TODO code application logic here
        
         ConConcreto miConversor= new ConConcreto();
         
         miConversor.dato=80.24;
        
         System.out.println(miConversor.farenheit2kelvin());
         System.out.println(miConversor.grado2radian());
        
        
        ConversorI miImp = new ConversorI();
        
        miImp.valor=38.58;
         
         System.out.println(miImp.grado2radian());
         System.out.println(miImp.kelvin2celsius());
         
      }
      
  }

    

