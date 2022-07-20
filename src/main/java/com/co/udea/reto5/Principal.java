/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto5;

/**
 *
 * @author HOME
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Pokemon p = new Charmander("Pepe",(byte)7,15);
        p = p.evolucionar();
        System.out.println(p.gritar());
        
        p = p.evolucionar();
        System.out.println(p.getNombre());
    }
}
