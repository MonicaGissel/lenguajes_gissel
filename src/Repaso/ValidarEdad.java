/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

/**
 *
 * @author T-107
 */
public class ValidarEdad {
    public static void validar (int edad )throws EdadNoNegativa{
        if (edad<0) throw new EdadNoNegativa ();
            
    }
}
