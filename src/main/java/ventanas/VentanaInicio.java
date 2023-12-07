package ventanas;

import javax.swing.*;

public class VentanaInicio extends Ventana{

    private JLabel textoMenu;
    private JButton botonRegistrarArtista, botonRegistrarAsistente,
            botonRegistrarEvento, botonSalir;
    protected VentanaInicio(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
    }

    private void generarBotonArtista() {
        String textoBoton = "Registrar Artista";
        this.botonRegistrarArtista = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonRegistrarArtista);
        this.botonRegistrarArtista.addActionListener(this);
    }
    private void generarBotonAsistente() {
        String textoBoton = "Registrar Asistente";
        this.botonRegistrarAsistente = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonRegistrarAsistente);
        this.botonRegistrarAsistente.addActionListener(this);
    }
    private void generarBotonEvento() {
        String textoBoton = "Registrar Evento";
        this.botonRegistrarEvento = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonRegistrarEvento);
        this.botonRegistrarEvento.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalir = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonSalir);
        this.botonSalir.addActionListener(this);
    }
}
