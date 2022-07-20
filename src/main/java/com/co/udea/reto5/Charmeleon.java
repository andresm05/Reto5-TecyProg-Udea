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
public class Charmeleon extends Pokemon {

    public Charmeleon(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Charizard(nombre, nivel, puntajeSalud);
        return p;
    }

    @Override
    public String gritar() {
        return "Charmeleon!";
    }

}
