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
public class Charmander extends Pokemon {

    public Charmander(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon p = new Charmeleon(nombre, nivel, puntajeSalud);
        return p;
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }

}
