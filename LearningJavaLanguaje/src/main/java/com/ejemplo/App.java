package com.ejemplo;

import java.time.LocalDate;
import java.time.Month;

public class App {
	public static void printObject(Object object) {
		if (object instanceof Empleado) {
			Empleado empleado = (Empleado) object;
			System.out.println("Salario: " + empleado.getSalario());
		} else if (object instanceof Estudiante) {
			Estudiante estudiante = (Estudiante) object;
			System.out.println("Número de asignaturas: " + estudiante.getTotalAsignaturas());
		} else if (object instanceof Persona) {
			Persona persona = (Persona) object;
			System.out.println("Nombre: " + persona.getNombre());
		} else {
			System.out.println("No se reconoce");
		}
	}

	public static String printObjeto(Object object) {
		if (object instanceof Empleado empleado) {
			return "Salario: " + empleado.getSalario();
		} else if (object instanceof Estudiante estudiante) {
			return "Número de asignaturas: " + estudiante.getTotalAsignaturas();
		} else if (object instanceof Persona persona) {
			return "Nombre: " + persona.getNombre();
		} else {
			return "No se reconoce";
		}
	}

	public static void main(String[] args) {
		Persona persona1 = Persona.builder().nombre("Jorge").primerApellido("Pascual").segundoApellido("Ramirez")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10)).build();
		Persona persona2 = Persona.builder().nombre("Sebastian").primerApellido("Sanjuanelo").segundoApellido("Arrieta")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)).build();
		Persona persona3 = Persona.builder().nombre("Alex Eduardo").primerApellido("Pilicita")
				.segundoApellido("Changoluisa").genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11)).build();
		Persona persona4 = Persona.builder().nombre("Javier").primerApellido("Jurado").segundoApellido("Moran")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25)).build();
		Persona persona5 = Persona.builder().nombre("Rodrigo").primerApellido("Rivero").segundoApellido("Fernandez")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4)).build();
		Persona[] personas = { persona1, persona2, persona3, persona4, persona5 };
		Estudiante est1 = new Estudiante();
		Empleado emp1 = new Empleado();
		Persona emp2 = new Empleado();
		System.out.println(emp1 instanceof Empleado);
		System.out.println(emp1 instanceof Persona);
		System.out.println(emp2 instanceof Empleado);
		System.out.println(emp2 instanceof Persona);
		printObject(persona1);
		printObject(est1);
		printObject(emp2);
		printObject(personas);
		System.out.println(printObjeto(emp1));
		System.out.println(printObjeto(persona2));
		System.out.println(persona2.getClass());
		System.out.println(emp2.getClass());
		// Ejercicio
		Empleado empleado1 = Empleado.builder()
				.genero(Genero.HOMBRE)
				.salario(10500.50)
				.build();
		Empleado empleado2 = Empleado.builder()
				.genero(Genero.HOMBRE)
				.salario(11500.20)
				.build();
		Empleado empleado3 = Empleado.builder()
				.genero(Genero.MUJER)
				.salario(13500.80)
				.build();
		Estudiante estudiante1 = Estudiante.builder()
				.totalAsignaturas(5)
				.build();
		Estudiante estudiante2 = Estudiante.builder()
				.totalAsignaturas(7)
				.build();
		Estudiante estudiante3 = Estudiante.builder()
				.totalAsignaturas(4)
				.build();
		Object[] array = { empleado1, empleado2, empleado3, estudiante1, estudiante2, estudiante3 };
		int total_empleados_hombre = 0;
		double suma_salarios_hombre = 0.;
		int total_estudiantes = 0;
		double suma_asignaturas = 0.;
		for (Object objeto : array) {
			if (objeto instanceof Empleado empleado) {
				if (empleado.getGenero() == Genero.HOMBRE) {
					total_empleados_hombre++;
					suma_salarios_hombre += empleado.getSalario();
				}
			} else if (objeto instanceof Estudiante estudiante) {
				total_estudiantes++;
				suma_asignaturas += estudiante.getTotalAsignaturas();
			} else {}
		}
		System.out.println("Salario medio en hombres: " + suma_salarios_hombre / total_empleados_hombre);
		System.out.println("Número medio asignaturas: " + suma_asignaturas / total_estudiantes);
	}
}