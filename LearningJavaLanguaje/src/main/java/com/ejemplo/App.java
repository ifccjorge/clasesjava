package com.ejemplo;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	public String texto = "Vivo en el plano de las instancias";
	
	public static void main(String[] args) {
		
		/* Creacion o instanciacion de objetos utilizando el patron Builder de Lombok
		 * , que no fue creado por Lombok pero si lo han mejorado para su utilizacion.
		 * 
		 * El patron Builder es llamado un patron de diseño Factory, es decir, es un patron
		 * de diseño creacional (para la creacion de objetos). 
		 * 
		 * ¿Que ventajas nos aporta?
		 * 
		 * Nos permite crear objetos aunque no tengamos el constructor explicitamente 
		 * implementado, y ademas cuando vamos a crear un objeto el orden en que utilicemos
		 * las propiedades o campos de la clase es indiferente */
		
		Persona p1 = Persona.builder()
				.salario(3500.25)
				.nombre("Carolina")
				.build();
		
		Persona persona2 = Persona.builder()
				.nombre("Sebastian")
				.primerApellido("Sanjuanelo")
				.segundoApellido("Arrieta")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(2000, Month.JANUARY, 20))
				.salario(4500.25)
				.build();
		
		System.out.println(persona2);
		
		System.out.println("El pais de todas las personas es: " + Persona.PAIS);

		// Mostrar el valor de la variable texto
		
	   // App app = new App();
	   
	   System.out.println(new App().texto);
		
		
	}
}