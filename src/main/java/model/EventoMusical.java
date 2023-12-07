package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventoMusical {
	private String nombre;
	private LocalDate fecha;
	private String lugar;
	private ArrayList<Artista> artistas;
	private ArrayList<Artista> artistasAsociados = new ArrayList<Artista>();
	private ArrayList<Entrada> entradas = new ArrayList<Entrada>();

	public EventoMusical(String nombre, LocalDate fecha, String lugar){
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.artistas = new ArrayList<Artista>();
		this.entradas = new ArrayList<Entrada>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<Artista> getArtistas() {
		throw new UnsupportedOperationException();
	}

	public void setArtistas(ArrayList<Artista> artistas) {
		throw new UnsupportedOperationException();
	}
}