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
public class ConConcreto extends AConversor {
       @Override
      double farenheit2kelvin() {
         
       return (dato+459.67)*5/9;
      }

    @Override
    double grado2radian() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

