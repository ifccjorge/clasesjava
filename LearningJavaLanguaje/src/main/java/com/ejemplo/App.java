package com.ejemplo;

import java.time.LocalDate;
import java.time.Month;

public class App {
	public String texto = "Hola";
	public static void main(String[] args) {
		Persona persona1 = Persona.builder()
				.nombre("Juana")
				.salario(30000)
				.genero(Genero.MUJER)
				.build();
		Persona persona2 = Persona.builder()
				.nombre("Luis")
				.fechaNacimiento(LocalDate.of(2000, Month.JANUARY, 20))
				.build();
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(Persona.PAIS);
		System.out.println(new App().texto);
	}
}