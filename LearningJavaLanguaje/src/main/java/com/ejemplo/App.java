package com.ejemplo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Persona persona1 = new Persona();
    	persona1.nombre = "Dani";
        System.out.println("Persona: " + persona1.nombre + " - " + persona1);
    	Persona persona2 = new Persona();
    	persona2.nombre = "Dani";
    	Persona persona3 = persona1;
    	System.out.println("Iguales: " + (persona1 == persona2));
    	System.out.println("Iguales: " + (persona1 == persona3));
    }
}