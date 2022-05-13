package com.femxa.lecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploList {

    public List<String> arrayAsList(String... arr) {
        //List<String> newList = Arrays.asList(arr);
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            newList.add(arr[i]);
        }
        return newList;
    }

    public void ejemplosList() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Fernando"); // Pos 0
        nombres.add("Saioa"); // Pos 2
        nombres.add(1, "Felix"); // Pos 1
        nombres.add("Jorge"); // Pos 3
        nombres.add("Saioa"); // Pos 4
        //boolean exp = nombres.add("Horacio");
        nombres.set(0, null);

        if (nombres.add("Horacio")) {
            System.out.println(nombres.get(0)); //length // Horacio pos 5
        }
        int count = 0;
        while (count < 3) {
            if (nombres.remove("Saioa")) {
                System.out.println("Registro eliminado con éxito");
            } else {
                System.out.println("No hay más registros que coincidan con el nombre facilitado.");
            }
            count++;
        }
    }
}
