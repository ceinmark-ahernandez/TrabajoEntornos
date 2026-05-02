package com.ceinmark.bases;

import java.time.LocalDate;

public class Profesor extends Persona {

    private Materia materia;



    public Profesor(String nombre, String apellidos, char sexo, String dni, LocalDate edad, Materia materia) {
        super(nombre, apellidos, sexo, dni, edad);
        this.materia = materia;
    }

    public Profesor(Materia materia) {
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

	@Override
	public String denominacionInstancia() {
		// TODO Auto-generated method stub
		return null;
	}
}
