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
  public void tuNombre(int x[]){

}
public class Arreglos1 {
    public static void main(String[] args) {
        //CORRECTOS
        int x[] =new int [3];
        
        
        int z[]={1,-200,45};
        
        //INCORRECTOS
        //int w=new int [ ];
        //int j [3]=new int [ ];
        //int m[ 4] =new int[4];
        //int [ ]n={1,2,3.5,}; 
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        //x[3]=12;
        
        //iterar
        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
            
    }
    }
}


