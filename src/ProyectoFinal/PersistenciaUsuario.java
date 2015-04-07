/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

/**
 *
 * @author T-107
 */
import java.io.*;

//solo vamos a guardar y buscar 
//utilixaremos mucho la abstraccion 
// asosiacion debil

public class PersistenciaUsuario {

    //PASO #1
    
    
    public void guardar(Usuario u) throws Exception {
        //creamos un objeto cde clase file( el contructor indica la ruta del
        //archoivo y el nombre delarchivo 
        File file=new File("D:\\archivaldo.yo");
        
        //PASO #2
        // estamos sacando algo del archivo osea vamos a escribir
        //solo sabremos que lo vbamos a sacar por el constructor (encadenamiento)
        
        
        FileOutputStream fos= new FileOutputStream    (file);
        
        
        //PASO#3
        //lenarlo con algo , en este caso es un usuario
        
    ObjectOutputStream oos= new ObjectOutputStream(fos);
    
    oos.writeObject(u);
    oos.close();
    }
    
    public Usuario leer () throws Exception {
      File file=new File("D:\\archivaldo.yo");
      
      FileInputStream fis =new FileInputStream(file);
      
      ObjectInputStream ois= new ObjectInputStream(fis);
      Usuario u= new Usuario ();
      
      u= (Usuario)ois.readObject();
   
    
      
    }

 
    
    
        
        
        
       
        
           
   