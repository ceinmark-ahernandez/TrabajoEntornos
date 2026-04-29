package com.ceinmark.bases;

import java.time.LocalDate;

/*
 Clase Alumno que hereda de Persona y utiliza el enum Materia.
*/
public class Alumno extends Persona {
  

   private double notaMedia;
   /*
    Constructor con parámetros
    */
   public Alumno(String nombre, String apellidos, char sexo, String dni, LocalDate fechaNacimiento, double notaMedia) {
       super(nombre, apellidos, sexo, dni, fechaNacimiento);
       this.notaMedia = notaMedia;
   }
   /**
    * Constructor vacío
    */
   public Alumno() {
       super();
       this.notaMedia = 0.0;
   }
   // Getters y Setters
  
  
 
   public double getNotaMedia() {
	return notaMedia;
}
   public void setNotaMedia(double notaMedia) {
	this.notaMedia = notaMedia;
   }

   @Override
   public String toString() {
       // Añadimos el toString a los datos del alumno
       return super.toString() + ".\n\tNota media: " + notaMedia;
   }
   @Override
   public String denominacionInstancia() {
	// TODO Auto-generated method stub
	return chequeoSexo() ? "Alumna" : "Alumno";
   }
}
