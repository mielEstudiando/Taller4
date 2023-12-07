import model.Artista;

import java.io.*;

public class GuardarClases {
    public static void guardarArtista(Artista artista, String nombreArchivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(artista);
            System.out.println("Objeto guardado en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Artista cargarArtista(String nombreArchivo) {
        Artista objeto = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            objeto = (Artista) in.readObject();
            System.out.println("Objeto cargado desde el archivo " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objeto;
    }

}
