
package ProyectoFinal;

public class ProbarSerializado {

    public static void main(String[] args) {
       //creamos un usuario
        
        Usuario u=new Usuario();
                u.SetEmail ("rapidiclmate@gmail.com");
                u.setNombre("juan Carlos");
                u.getSueldo(40000);
                  //lo guardamos 
                 
        PersistenciaUsuario per =new PersistenciaUsuario ();
        
        try {
            per.guardar (u) ;
            System.out.println ("Usuario guardado con exito");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
            
        }
                  
  
    
}
