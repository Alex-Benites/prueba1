/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Abeni
 */
public class EjemploComparable {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        
        personas.add(new Persona("Messi", 35,"Brown","777777777"));
        personas.add(new Persona("Charlie", 25,"Benites","66666666666"));
        personas.add(new Persona("Leonel", 45,"Messi","555555555"));
        personas.add(new Persona("Alice", 30,"Rosalia","999999999"));
        personas.add(new Persona("Bob", 25,"Patiño","88888888"));
        System.out.println("lista no ordenada");
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        Collections.sort(personas); // Ordena la lista por edad
        System.out.println("");
        System.out.println("lista ordenada");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
}
