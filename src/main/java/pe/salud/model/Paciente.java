package pe.salud.model;

public class Paciente {

    private final String documento;
    private final String nombre;
    private final String apellido;
    private final String telefono;
    private final String correo;

    public Paciente(String documento, String nombre, String apellido, String telefono, String correo) {

        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getDocumento() {
        return documento;
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
}
