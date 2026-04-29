package com.ceinmark.bases;

public class Profesor extends Persona {

    private Materia materia;



    public Profesor(String nombre, String apellidos, char sexo, String dni, int edad, Materia materia) {
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
}
