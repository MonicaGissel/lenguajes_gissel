/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author T-301
 */
//clase de aplicacion , la que se va a ejectutar 

public class TestSuperficie {
public static void main (String [] args)throws Exception {
   for (superficie s:GenerarSuperficies.obtenerFiguras()){
     System.out.println( s.calcularArea());
       
       
        
}   
}
}