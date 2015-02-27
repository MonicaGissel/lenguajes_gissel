/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author T-3
 */
public class Cuadrado implements superficie {
private float lado;

    public Cuadrado() {
    }
/**
 * Este constructor tiene un argumento de tipo flotante 
 * elparanetro que debes ingresar es el valor del lado de tu cuadrado
 * @param lado 
 */

public Cuadrado (float lado){
} 
public float getLado(){
    return lado;
}
    public void setLado (float lado){
        
        this.lado=lado;
        
        // TODO code application logic here
    }
    public float calcularArea(){
        System.out.print("El área del cuadrado es :");
        float area=lado*lado;
        return area;
        
    }
}
