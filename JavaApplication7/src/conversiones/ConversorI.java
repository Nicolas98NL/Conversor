
package conversiones;


    public class ConversorI implements ITransformador{
  
     double valor;
      
   
 
      @Override
      public double grado2radian() {
     
     
        
        
         return (valor * Math.PI)/180;
      }
  
      @Override
     public double kelvin2celsius() {
    
         return (valor-273.15);
      }

    
  }
    

