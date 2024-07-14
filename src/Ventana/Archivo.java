
package Ventana;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Archivo {
    File archivo;
    
    public void crearArchivo(){
        try {
            archivo = new File("AgendaContactos.txt");
            if(archivo.createNewFile()){
                // Archivo CReado
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro. "+ex);
        }
    }// crear archivo ends
    
    public void escribirTexto(Persona persona){
        try {
            // El TRUE que se agrega es para indicar que al archivo se le añadirá texto
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(persona.getNombre()+"%"+persona.getApellido()+"%"+persona.getTelefono()+
                    "%"+persona.getCorreo()+"%"+persona.getDireccion()+"\r\n");
            escribir.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro. "+ex);
        }
    }
}
