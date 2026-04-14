package com.ejemplo;

import java.time.LocalDate;
import java.time.Month;

public class App {
	private static final int TOTAL_ELEMENTOS = 100;

	public static void main(String[] args) {
		Persona persona1 = Persona.builder().nombre("Jorge").primerApellido("Pascual").segundoApellido("Ramirez")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10)).salario(3500.50).build();
		Persona persona2 = Persona.builder().nombre("Sebastian").primerApellido("Sanjuanelo").segundoApellido("Arrieta")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)).salario(2450.70).build();
		Persona persona3 = Persona.builder().nombre("Alex Eduardo").primerApellido("Pilicita")
				.segundoApellido("Changoluisa").genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11)).salario(4800.46).build();
		Persona persona4 = Persona.builder().nombre("Javier").primerApellido("Jurado").segundoApellido("Moran")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25)).salario(4500.50).build();
		Persona persona5 = Persona.builder().nombre("Rodrigo").primerApellido("Rivero").segundoApellido("Fernandez")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4)).salario(3760.40).build();
		Persona[] personas = { persona1, persona2, persona3, persona4, persona5 };
		for (int i = 0; i < personas.length; i++)
			System.out.println(personas[i]);
		int[] numerosEnteros = new int[TOTAL_ELEMENTOS];
		for (int i = 0; i < TOTAL_ELEMENTOS; i++)
			numerosEnteros[i] = i + 1;
		System.out.println("--- EJERCICIO 3 ---");
		// Ejercicio 3
		int numerosImpares = 0;
		for (int numero : numerosEnteros) {
			if (numero % 2 == 1) {
				numerosImpares++;
				System.out.println("El valor es " + numero);
			}
		}
		System.out.println("Números impares encontrados: " + numerosImpares);
	}
}