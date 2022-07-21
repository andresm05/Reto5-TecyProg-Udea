
package com.co.udea.reto5;

/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public abstract class Pokemon {

    protected String nombre;
    protected byte nivel;
    protected int puntajeSalud;

    public Pokemon(String nombre, byte nivel, int puntajeSalud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public int getPuntajeSalud() {
        return puntajeSalud;
    }

    public void setPuntajeSalud(int puntajeSalud) {
        this.puntajeSalud = puntajeSalud;
    }
    
    
    public abstract Pokemon evolucionar();

    public abstract String gritar();
}
