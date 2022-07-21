
package com.co.udea.reto5;

/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public class Charizard extends Pokemon {

    public Charizard(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
        return "Charizard!";
    }

}
