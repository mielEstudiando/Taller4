package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaInicio extends Ventana{

    private JLabel textoMenu;
    private JButton botonRegistrarArtista, botonRegistrarAsistente,
            botonRegistrarEvento, botonSalir;
    public VentanaInicio() {
        super("Inicio", 600, 500);
        generarVentana();
        mostrarVentana();
    }

    private void generarVentana() {
        mensajeInicio();
        generarBotonArtista();
        generarBotonAsistente();
        generarBotonEvento();
        generarBotonSalir();
    }
    private void mensajeInicio() {
        String textoBienvenida = "Global Music Events";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 190, 30, 250, 30);
    }
    private void generarBotonArtista() {
        String textoBoton = "Registrar Artista";
        this.botonRegistrarArtista = super.generarBoton(textoBoton, 175, 100, 250, 40);
        this.add(this.botonRegistrarArtista);
        this.botonRegistrarArtista.addActionListener(this);
    }
    private void generarBotonAsistente() {
        String textoBoton = "Registrar Asistente";
        this.botonRegistrarAsistente = super.generarBoton(textoBoton, 175, 180, 250, 40);
        this.add(this.botonRegistrarAsistente);
        this.botonRegistrarAsistente.addActionListener(this);
    }
    private void generarBotonEvento() {
        String textoBoton = "Registrar Evento";
        this.botonRegistrarEvento = super.generarBoton(textoBoton, 175, 260, 250, 40);
        this.add(this.botonRegistrarEvento);
        this.botonRegistrarEvento.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalir = super.generarBoton(textoBoton, 225, 340, 150, 40);
        this.add(this.botonSalir);
        this.botonSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonSalir) {
            //aquí se añadirá el sistema de guardado de datos cuando corresponda :)
            this.dispose();
            System.exit(0);
        }
        if(e.getSource() == this.botonRegistrarArtista){
            VentanaRegistroArtista ventanaRegistroArtista= new VentanaRegistroArtista();
            this.dispose();
        }
        if(e.getSource() == this.botonRegistrarEvento){
            VentanaRegistroEvento ventanaRegistroEvento= new VentanaRegistroEvento();
            this.dispose();
        }
        if(e.getSource() == this.botonRegistrarAsistente){
            VentanaRegistroAsistente ventanaRegistroAsistente= new VentanaRegistroAsistente();
            this.dispose();
        }
    }
}
