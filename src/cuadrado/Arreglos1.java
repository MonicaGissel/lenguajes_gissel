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
//  public void tuNombre(int x[]){


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
        // exceocion de aritmetica 
        int a=2;
        //para los racionales imprime infinito
                float b=0;
                System.out.println(a/b);
        for (int i=0; i<4; i++){
            System.out.println(x[i]);
        }
        System.out.println("si ocurre la excepcion" +"nunca me veras");
    }
}
  /*  for (int algodon :x){
        System.out.println(algodon);
        }
               */
    
    



