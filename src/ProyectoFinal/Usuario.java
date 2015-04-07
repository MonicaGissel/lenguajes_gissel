
/*una vez creado el archivo serializado no podras modificar la clase que 
*guardaste a menos que borres fisicamente el archivo creado
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.Serializable;

/**
 *
 * @author T-107
 */

public class Usuario implements Serializable {
    private String nombre;
    private float sueldo;
    private String email;

    public Usuario(String nombre, float sueldo, String email) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
    }

    Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    void SetEmail(String rapidiclmategmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getSueldo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
