package com.ejemplo;

import java.time.LocalDate;
import java.time.Month;

public class App {
	public static void main(String[] args) {
		Empleado empleado1 = Empleado.builder()
				.nombre("Juana")
				.primerApellido("")
				.segundoApellido("")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(2000, Month.JANUARY, 20))
				.salario(30000.)
				.dpto(Dpto.CONTABILIDAD)
				.fechaAlta(LocalDate.of(2000, Month.JANUARY, 20))
				.ssn("A")
				.build();
		System.out.println(empleado1);

	}
}