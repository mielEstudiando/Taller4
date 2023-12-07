package model;

import java.util.ArrayList;

public class Artista {
	private String nombre;
	private Genero genero;
	private ArrayList<EventoMusical> eventosMusicales = new ArrayList<EventoMusical>();

	public Artista(String nombre, Genero genero){
		this.genero = genero;
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return this.genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", genero=" + genero + "]";
	}
}