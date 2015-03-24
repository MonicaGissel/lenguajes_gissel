/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author T-107
 */
import java.util.*;
public class ModeloGaleria {
    public static ArrayList<Galeria> generarGaleria(){
       //arreglo mutable, ya se4 puede agregar un ojeto que sean del tipo Galeria  
        
        ArrayList<Galeria> arreglo=new ArrayList<Galeria>();
        
        
        
        
        Galeria g1=new Galeria("titulo1" ,"descricpion1", "/proyecto/uno.jpg");

Galeria g2=new Galeria("titulo2" ,"descricpion2", "/proyecto/dos.jpg");

Galeria g3=new Galeria("Titulo 3", "descripcion3","/proyecto/tres.jpg");

arreglo.add(g1);
arreglo.add(g2);
arreglo.add(g3);
        return arreglo;

    
}
}



















    

    
    
