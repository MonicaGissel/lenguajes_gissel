/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;
import java.util.*;       

/**
 *
 * @author T-301
 */
public class GenerarSuperficies {
public   static ArrayList<superficie>obtenerFiguras()throws Exception{
ArrayList<superficie> figuritas=new ArrayList<superficie>();

//primero creamos cuadrados 
Cuadrado cu1=new Cuadrado(12);
Cuadrado cu2=new Cuadrado(14);
Cuadrado cu3=new Cuadrado(13);
Rectangulo r1=new Rectangulo(10,4);
Triangulo tr1=new Triangulo(11,2);
Triangulo tr2=new Triangulo (12,4);
Circulo c1=new Circulo(15);
Circulo c2=new Circulo (25);

//sig paso es agregarlos al ArrayList FIGURITAS 

figuritas.add(cu1);
figuritas.add(cu2);
figuritas.add(cu3);
figuritas.add(r1);
figuritas.add(tr1);
figuritas.add(tr2);
figuritas.add(c1);
figuritas.add(c2);
return figuritas;


}

}