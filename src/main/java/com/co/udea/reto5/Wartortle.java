/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto5;

/**
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public class Wartortle extends Pokemon {

    public Wartortle(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Blastoise(nombre, nivel, puntajeSalud);
        return p;
    }

    @Override
    public String gritar() {
        return "Wartortle!";
    }

}
