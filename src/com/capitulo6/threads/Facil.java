/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.threads;

/**
 *
 * @author T-301
 */
public class Facil extends Thread {
    public void run(){
        try{
            Thread.sleep(3000);
        System.out.println("Soy un Thread facil");
        String nombre =Thread.currentThread() .getName();
        System.out.println("Me llamo "+nombre);
        
    } catch(InterruptedException e){}
        
    }
}
