
package com.co.udea.reto5;

/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
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
