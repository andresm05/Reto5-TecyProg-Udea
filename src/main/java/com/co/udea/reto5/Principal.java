package com.co.udea.reto5;

/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public class Principal {

    public static void main(String[] args) {

        //Creacion de pokebolas y pokemones
        Pokebola poke1, poke2, poke3;
        Pokemon p1, p2, p3;
        poke1 = new Pokebola("pequeña");
        poke2 = new Pokebola("mediana");
        poke3 = new Pokebola("grande");

        //Crear un Pokemon de tipo Charmander
        p1 = new Charmander("Pepe", (byte) 7, 15);
        System.out.println(p1.gritar());
        //Evolucionar el Charmander a Charmeleon
        p1 = p1.evolucionar();
        System.out.println(p1.gritar());

        //Evolucionar el Charmeleon a Charizard
        p1 = p1.evolucionar();
        System.out.println(p1.gritar());

        //Atrapar el Charizard en la pokebola.
        poke1.setPokemon(p1);
        
        //Nombre del Pokemon en la pokebola 1
        System.out.println("Nombre del Pokemon en la Pokebola 1:");
        System.out.println(poke1.getPokemon().getNombre());
        
        //Crear un Pokemon de tipo Pikachu
        p2 = new Pikachu("Juan", (byte) 12, 20);
        System.out.println(p2.gritar());
        //Evolucionar Pikachu a Raichu
        p2 = p2.evolucionar();
        System.out.println(p2.gritar());
        
        //Atrapar el Raichu en la pokebola.
        poke2.setPokemon(p2);
        
        //Nombre del Pokemon en la Pokebola 2
        System.out.println("Nombre del Pokemon en la Pokebola 2:");
        System.out.println(poke2.getPokemon().getNombre());
        
        //Crear un Pokemon de tipo Squirtle
        p3 = new Squirtle("Toyo",(byte)20,40);
        System.out.println(p3.gritar());
        
        //Evolucionar Squirtle a Wartortle
        p3 = p3.evolucionar();
        System.out.println(p3.gritar());
        
        //Evolucionar Wartortle a Blastoise
        p3 = p3.evolucionar();
        System.out.println(p3.gritar());
        
        //Atrapar el Blastoise en la pokebola
        poke3.setPokemon(p3);
        
        //Nombre del Pokemon en la Pokebola 3
        System.out.println("Nombre del Pokemon en la Pokebola 3:");
        System.out.println(poke3.getPokemon().getNombre());
    }
}
