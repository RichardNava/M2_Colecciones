package com.femxa.lecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

    
    
    
    
    
    
    
    
    
    
    public void ejemplosSet() {

        Set<Integer> numbers = Set.of(14, 89, 761, 90);
        Set<Integer> numbers2 = Set.copyOf(numbers);
        //numbers.remove(14); //Excepción porque el Set es inmutable
        //numbers.add(14123); //Excepción porque el Set es inmutable
        //numbers.add(null); //Excepción porque el Set es inmutable
        for (Integer number : numbers) {
            System.out.println(number);
        }
        Set<Character> letras = new HashSet<>();
        letras.add('a');
        letras.add('b');
        letras.add('c');
        letras.add('d');
        if (letras.add('a')) {
            System.out.println("No existe");
        } else {
            System.out.println("Ya existe");
        }
        for (Character letra : letras) {
            System.out.println(letra);
        }

        Set<String> decimales = new TreeSet<>();
        decimales.add("1adrian");
        decimales.add("alvaro");
        decimales.add("*Borja");
        decimales.add("2Andres");
        for (String dec : decimales) {
            System.out.println(dec);
        }
    }
}
