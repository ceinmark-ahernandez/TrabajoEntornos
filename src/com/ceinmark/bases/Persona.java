package com.ceinmark.bases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase abstacta Persona.
 */
public abstract class Persona {
	private String nombre;
	private String apellidos;
	private Character sexo;
	private String dni;
	private LocalDate fechaNacimiento;

	/**
	 * Constructor con parámetros.
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @param dni
	 * @param edad
	 */
	public Persona(String nombre, String apellidos, Character sexo, String dni, LocalDate fechaNacimiento) {			
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Constructor vacío
	 */
	public Persona() {
		this("", "", ' ', "", LocalDate.now().minusYears(17));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Método que devuelve un booleano en función del sexo de la persona para
	 * facilitar el manejo de Strings.
	 * @return {@code true} si la persona es mujer, {@code false} si la persona
	 *         es un hombre.
	 */
	protected boolean chequeoSexo() {
		boolean mujer = true;
		if (sexo.equals('M') || sexo.equals('m')) {
			mujer = true;
		} else if (sexo.equals('H') || sexo.equals('h')) {
			mujer = false;
		}
		return mujer;
	}
	
	/**
	 * Método abstracto que devuelve un String determinado en función del sexo de la
	 * instancia, empleando el método chequeoSexo().
	 */
	public abstract String denominacionInstancia();
	
	@Override
	public String toString() {
		String preposicionDe = chequeoSexo() ? "de la " : "del ";
		return "Datos " + preposicionDe + denominacionInstancia() + " con DNI " + dni + ":\n\tNombre: " + nombre
				+ ".\n\tApellidos: " + apellidos + ".\n\tFecha de nacimiento: "
				+ fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ".";
	}
}
