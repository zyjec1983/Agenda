
package Ventana;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;

    public Persona(String nombre, String apellido, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    } 

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }
    
}
