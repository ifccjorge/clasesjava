package com.ejemplo;

import java.time.LocalDate;
import java.time.Month;

public class App {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		Persona persona1 = empleado1;
		Empleado empleado2 = new Empleado(3500.5, Dpto.RRHH, LocalDate.of(2020, Month.MARCH, 3));
		Persona persona2 = new Persona();
		// Empleado persona3 = persona2;
		// persona1.setNombre("Dani");
		// System.out.println("Persona: " + persona1.getNombre());
		// System.out.println("Persona: " + persona1);
	}
}