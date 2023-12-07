package ventanas;

import model.Artista;
import model.Asistente;
import model.Genero;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaRegistroAsistente extends Ventana {
    private JLabel textoMenu, textoID, textoTelefono;
    private JTextField campoID, campoTelefono;
    private JButton botonRegistro, botonAtras, botonSalir;

    private Genero[] generos= {Genero.POP, Genero.ROCK, Genero.INDIE,
            Genero.INSERTEGENERO, Genero.NOTENGOCREATIVIDAD};
    protected VentanaRegistroAsistente() {
        super("Registro Asistente", 500, 500);
        generarVentana();
        mostrarVentana();
    }
    private void generarVentana() {
        generarCampoID();
        generarCampoTelefono();
        generarBotonRegistro();
        generarBotonAtras();
        generarBotonSalir();
    }


    private void generarCampoID(){
        String textoID= "ID:";
        super.generarJLabel(this.textoID,textoID,20,50,150,20);
        this.campoID= super.generarJTextField(200,50,250,20);
        this.add(this.campoID);
    }

    private void generarCampoTelefono(){
        String textoTelefono= "Teléfono:";
        super.generarJLabel(this.textoTelefono,textoTelefono,20,100,150,20);
        this.campoTelefono= super.generarJTextField(200,100,250,20);
        this.add(this.campoTelefono);
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

    private Asistente registrarAsistente(){
        return new Asistente(this.campoID.getText(), campoTelefono.getText());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonSalir) {
            //aquí se añadirá el sistema de guardado de datos cuando corresponda :)
            this.dispose();
            System.exit(0);
        }
        if(e.getSource() == this.botonRegistro){
            if ((!(this.campoTelefono.getText().isEmpty()))&&(!(this.campoID.getText().isEmpty()))) {
                registrarAsistente();
                JOptionPane.showMessageDialog(this,"Asistente registrado correctamente");
                VentanaInicio ventanaInicio = new VentanaInicio();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error, ingrese correctamente los datos");
            }
        }
        if(e.getSource() == this.botonAtras){
            VentanaInicio ventanaInicio= new VentanaInicio();
            this.dispose();
        }
    }
}