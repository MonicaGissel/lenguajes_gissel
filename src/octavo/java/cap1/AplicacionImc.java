/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.cap1;

/**
 *
 * @author T-107
 */
public class AplicacionImc {

    /**
     * @param args the command line arguments                       
     */
    public static void main(String[] args) {
      //primero se crea un objeto de tipi Imc 
        Imc x=new Imc() ;               
//refencia    intancia o constructor 
         float resultado=   x.calcular(1.68f, 70);
        System.out.println("tu Imc es :" +resultado);
        


    }
    
}
