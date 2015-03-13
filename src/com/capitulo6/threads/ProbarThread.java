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
public class ProbarThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("probar Threads");
        // paso 1 crearlo 
        Facil t1=new Facil();
        Regular r1=new Regular ();
        Thread t2=new Thread (r1);
        Thread t3=new Thread(new Runnable (){
       
            @Override
            public void run() {
               System.out.println("SOy un thread mucho mejor");
            }
            
        }
        );
        Thread t4=new Relojito();
        
        //paso dos inicializado 
        t1.start ();
        t2.start();
        t3.start(); 
        t4.start();
        
        //t1.setName("petra");
    }
    
}
