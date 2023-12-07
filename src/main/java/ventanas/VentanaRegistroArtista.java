package ventanas;

import model.Genero;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaRegistroArtista extends Ventana {

    private JLabel textoMenu, textoNombre, textoGeneros;
    private JTextField campoNombre;
    private JComboBox listaGeneros;
    private JButton botonRegistro, botonAtras, botonSalir;

    private Genero[] generos= {Genero.POP, Genero.ROCK, Genero.INDIE,
            Genero.INSERTEGENERO, Genero.NOTENGOCREATIVIDAD};
    protected VentanaRegistroArtista() {
        super("Registro Artista", 500, 500);
        generarVentana();
        mostrarVentana();
    }
    private void generarVentana() {
        generarCampoNombre();
        generarListaGenero();
        generarBotonRegistro();
        generarBotonAtras();
        generarBotonSalir();
    }


    private void generarCampoNombre(){
        String textoNombre= "Nombre:";
        super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
        this.campoNombre= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombre);
    }

    private void generarListaGenero(){
        String textoGenero = "Genero:";
        super.generarJLabel(this.textoGeneros,textoGenero,20,100,150,20);
        this.listaGeneros = super.generarListaDesplegable(generos,20,100,150,20);
        this.add(this.listaGeneros);
    }
    private void generarBotonRegistro() {
        String textoBoton = "Registrar";
        this.botonRegistro = super.generarBoton(textoBoton, 175, 180, 340, 40);
        this.add(this.botonRegistro);
        this.botonRegistro.addActionListener(this);
    }
    private void generarBotonAtras() {
        String textoBoton = "Atrás";
        this.botonAtras = super.generarBoton(textoBoton, 175, 260, 340, 40);
        this.add(this.botonAtras);
        this.botonAtras.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalir = super.generarBoton(textoBoton, 175, 340, 340, 40);
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