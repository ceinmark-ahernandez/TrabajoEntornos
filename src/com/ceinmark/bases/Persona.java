package com.ceinmark.bases;

/**
 * Clase abstacta Persona.
 */
public abstract class Persona {
	private String nombre;
	private String apellidos;
	private char sexo;
	private String dni;
	private int edad;

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @param dni
	 * @param edad
	 */
	public Persona(String nombre, String apellidos, char sexo, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.dni = dni;
		this.edad = edad;
	}

	/**
	 * Constructor vacío
	 */
	public Persona() {
		this("", "", ' ', "", 0);
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Datos de persona con DNI " + dni + ":\n\tNombre: " + nombre + ".\n\tApellidos: " + apellidos
				+ ".\n\tSexo: " + sexo + ".\n\tEdad: " + edad + ".";
	}
}
