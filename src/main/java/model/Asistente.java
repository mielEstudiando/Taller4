package model;

import java.util.ArrayList;

public class Asistente {
	private String id;
	private String telefono;
	private ArrayList<Genero> preferencias;
	private Entrada entrada;

	public Asistente(String id, String telefono){
		this.id = id;
		this.telefono = telefono;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Genero> getPreferencias() {
		return this.preferencias;
	}

	public void setPreferencias(ArrayList<Genero> preferencias) {
		throw new UnsupportedOperationException();
	}
}