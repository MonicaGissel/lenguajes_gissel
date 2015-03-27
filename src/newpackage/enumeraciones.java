/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author T-301
 */
public class enumeraciones {
    
    public static void main(String [] args ){
       
       MaquinaBuena maquina= new MaquinaBuena();
       maquina.setEstado(EstadoDeMaquina.LINEA);
      
       
    System.out.println("el esatdo de la maquina es:"+maquina.getEstado());
    
    
    }
    
    
    
   
    
}
