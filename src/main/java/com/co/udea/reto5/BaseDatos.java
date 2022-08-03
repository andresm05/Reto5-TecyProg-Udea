/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto5;

/**
 *
 * @author jaime.munozq
 */
public class BaseDatos {

    public String getOrigen(String p) {
        String origen = "";
        origen = switch (p) {
            case "Charizard", "Charmeleon", "Charmander" ->
                "El pokemon es nativo de Pueblo Paleta";
            case "Squirtle", "Wartortle", "Blastoise" ->
                "El pokemon es nativo de Pueblo Fungi";
            case "Pikachu", "Raichu" ->
                "El pokemon es nativo de Pueblo kanto";
            default ->
                "El pokemon no se encuentra en la base de datos";
        };
        return origen;
    }

    public String getColor(String p) {
        String color = "";
        color = switch (p) {
            case "Charizard", "Charmeleon", "Charmander" ->
                "Rojo";
            case "Squirtle", "Wartortle", "Blastoise" ->
                "Azul";
            case "Pikachu", "Raichu" ->
                "Amarillo";
            default ->
                "El pokemon no se encuentra en la base de datos";
        };
        return color;
    }

    public String getTipo(String p) {
        String color = "";
        color = switch (p) {
            case "Charizard", "Charmeleon", "Charmander" ->
                "Fuego";
            case "Squirtle", "Wartortle", "Blastoise" ->
                "Agua";
            case "Pikachu", "Raichu" ->
                "Eléctrico";
            default ->
                "El pokemon no se encuentra en la base de datos";
        };
        return color;
    }

    public int getAnios(String p) {
        int anios = 0;
        anios = switch (p) {
            case "Charizard", "Charmeleon", "Charmander" ->
                8;
            case "Squirtle", "Wartortle", "Blastoise" ->
                10;
            case "Pikachu", "Raichu" ->
                12;
            default ->
                0;
        };
        return anios;
    }

    public String getDescripcion(String p) {
        String descripcion = "";

        descripcion = switch (p) {
            case "Charizard", "Charmeleon", "Charmander" ->
                "Pokemon que vive en la lava";
            case "Squirtle", "Wartortle", "Blastoise" ->
                "Le encanta el agua";
            case "Pikachu", "Raichu" ->
                "Le gustan los truenos";
            default ->
                "El pokemon no se encuentra en la base de datos";
        };
        return descripcion;
    }
}
