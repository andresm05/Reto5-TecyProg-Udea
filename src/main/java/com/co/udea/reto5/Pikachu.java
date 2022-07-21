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
public class Pikachu extends Pokemon {

    public Pikachu(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Raichu(nombre, nivel, puntajeSalud);
        return p;
    }

    @Override
    public String gritar() {
        return "Pikachu!";
    }

}
