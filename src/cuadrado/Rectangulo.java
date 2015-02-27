/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author T-107
 */
public class Rectangulo implements superficie {
private float Mayor;
private float Menor;

    public float getMayor() {
        return Mayor;
    }

    public Rectangulo() {
    }

    public Rectangulo(float Mayor, float Menor) {
        this.Mayor = Mayor;
        this.Menor = Menor;
    }

    public void setMayor(float Mayor) {
        this.Mayor = Mayor;
    }

    public float getMenor() {
        return Menor;
    }

    public void setMenor(float Menor) {
        this.Menor = Menor;
    }

  public float calcularArea(){
      System.out.print("el area de rectangualo es :");
      return Mayor*Menor;
      
      
  }
}