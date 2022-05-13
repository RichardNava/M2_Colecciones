package com.femxa.app;

import com.femxa.lecciones.EjemploList;
import com.femxa.lecciones.EjemploSet;
import java.util.*;

public class ApMain {

    public static void main(String[] args) {

        EjemploList el = new EjemploList();
        List<String> nombres2 = el.arrayAsList(new String[]{"Paco","Ramon","Alvaro"});
        List<String> nombres3 = el.arrayAsList("Paco","Ramon","Alvaro");
        //el.ejemplosList();
        
        for (String nombre : nombres2) { System.out.println(nombre); }
        nombres2.forEach(s -> System.out.println(s)); //Hablaremos en el futuro 
        nombres3.forEach(System.out::println);

        EjemploSet es = new EjemploSet();
        //es.ejemplosSet();
        
        Alumno a1 = new Alumno("Federico", "Torres", "23111998G", 243212315);
        Alumno a2 = new Alumno("Sonia", "Alvarez", "43235498G", 943212315);
        Alumno a3 = new Alumno("Lionel", "Messi", "36892998F", 166234315);
        
        Map<String,Alumno> alumnos = new TreeMap<>();
        alumnos.put(a1.dni, a1); // DNI - ALUMNO
        alumnos.put(a2.dni, a2);
        alumnos.put(a3.dni, a3);
        
        Set<String> nombresAlumnos = alumnos.keySet();
        for (String dni : nombresAlumnos) {
            System.out.println(dni);
        }
        
        for (Alumno alum : alumnos.values()) {
            System.out.println(alum);
        }
        System.out.println(alumnos.get(a1.dni));
    }
    
}
class Alumno{
    String name;
    String secondName;
    String dni;
    int ss;

    public Alumno(String name, String secondName, String dni, int ss) {
        this.name = name;
        this.secondName = secondName;
        this.dni = dni;
        this.ss = ss;
    }

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", secondName=" + secondName + ", dni=" + dni + ", ss=" + ss + '}';
    }
    
    
    
}
