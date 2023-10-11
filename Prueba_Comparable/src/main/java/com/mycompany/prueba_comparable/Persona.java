/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_comparable;

/**
 *
 * @author Abeni
 */
public class Persona implements Comparable<Persona> { 
    private String nombre;
    private int edad;
    private String apellido;
    private String cedula;

    public Persona(String nombre, int edad, String apellido, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    
    // este compareTo es para ordenar primero por Nombre y luego por Apellido
    @Override
    public int compareTo(Persona otraPersona) {

        int comparacionNombre = this.nombre.compareTo(otraPersona.nombre);
  
        if (comparacionNombre == 0) {
            return this.apellido.compareTo(otraPersona.apellido);
        }
        
        return comparacionNombre;
    }

    @Override
    public String toString() {
        return nombre + " - " + apellido + " - "+ edad + " - "+ cedula;
    }
    
    
    // este compare To es solo para compara por la edad de esa persona y ordenarlos
    /*
        @Override
        public int compareTo(Persona otraPersona) {
            return this.edad - otraPersona.edad;
        }
    */
    
    
    
    /*
    // este compareTo es para ordenar por Apellido
    @Override
    public int compareTo(Persona otraPersona) {

        return this.apellido.compareTo(otraPersona.apellido);
    }
    */
    
  
    
    /*
    // este compareTo es para ordenar por Nombre
    @Override
    public int compareTo(Persona otraPersona) {

        return this.nombre.compareTo(otraPersona.nombre);
    }
    */

    /*
    // este compareTo es para ordenar primero por nombre y luego por Apellido
    @Override
    public int compareTo(Persona otraPersona) {

        int comparacionNombre = this.nombre.compareTo(otraPersona.nombre);
  
        if (comparacionNombre == 0) {
            return this.apellido.compareTo(otraPersona.apellido);
        }
        
        return comparacionNombre;
    }
    */
    
    
    
    /*
    // este compareTo es para ordenar primero por Apellido y luego por Nombre
    @Override
    public int compareTo(Persona otraPersona) {

        int comparacionApellido = this.apellido.compareTo(otraPersona.apellido);
  
        if (comparacionApellido == 0) {
            return this.nombre.compareTo(otraPersona.nombre);
        }
        
        return comparacionApellido;
    }
    */
}
