package com.ceinmark.bases;


import java.util.Objects;
import java.util.TreeMap;

public class Aula {
	private final String numeroAula;
	private final int capacidad;
	private final double metrosx2;
	private TreeMap<Integer, Alumno> listaAlumnos = new TreeMap<>();
	private TreeMap<Integer, Profesor> listaProfesores = new TreeMap<>();
	
	
	public Aula(String numeroAula, int capacidad, double metrosx2, TreeMap<Integer, Alumno> listaAlumnos,
			TreeMap<Integer, Profesor> listaProfesores) {
		super();
		this.numeroAula = numeroAula;
		this.capacidad = capacidad;
		this.metrosx2 = metrosx2;
		this.listaAlumnos = listaAlumnos;
		this.listaProfesores = listaProfesores;
	}


	public String getNumeroAula() {
		return numeroAula;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public double getMetrosx2() {
		return metrosx2;
	}


	public TreeMap<Integer, Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public TreeMap<Integer, Profesor> getListaProfesores() {
		return listaProfesores;
	}


	public void setListaAlumnos(TreeMap<Integer, Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}


	public void setListaProfesores(TreeMap<Integer, Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}


	@Override
	public int hashCode() {
		return Objects.hash(numeroAula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Objects.equals(numeroAula, other.numeroAula);
	}


	@Override
	public String toString() {
		return String.format("Aula: %s\nCapacidad: %d - Metros (2x): %.3f\nCant. Alumnos: %d - Cant. Profesores: %d",
				numeroAula, capacidad, metrosx2, listaAlumnos.size(), listaProfesores.size());
	}
	
		
}
