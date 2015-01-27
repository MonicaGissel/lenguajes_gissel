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
public class Imc {
    private float estatura;
    private  float peso;
    public void setPeso(float peso){
        this.peso=peso;
        
    }
    public void setEstatura (float estatura){
        this.estatura=estatura;
        
    }
    //metodo set cuando sean privados los atributos se ustiliza este metodo
    
    public float calcular(float estatura, float peso){
        
   float algo= peso /(estatura*estatura);
   return algo;
   
// tambie se puede declarar como float y declarar otra variable llamda algo y regreserla con un return 

    
      
              }
}
