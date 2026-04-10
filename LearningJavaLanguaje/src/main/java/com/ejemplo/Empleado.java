package com.ejemplo;

import java.time.LocalDate;

public class Empleado extends Persona {
	private double salario;
	private Dpto dpto;
	private LocalDate fechaAlta;

	public Empleado() {
	}

	public Empleado(double salario, Dpto dpto, LocalDate fechaAlta) {
		this.salario = salario;
		this.dpto = dpto;
		this.fechaAlta = fechaAlta;
	}

	public Empleado(String nombre, String primerApellido, String segundoApellido, Genero genero,
			LocalDate fechaNacimiento, double salario, Dpto dpto, LocalDate fechaAlta) {
		super(nombre, primerApellido, segundoApellido, genero, fechaNacimiento);
		this.salario = salario;
		this.dpto = dpto;
		this.fechaAlta = fechaAlta;
	}

}