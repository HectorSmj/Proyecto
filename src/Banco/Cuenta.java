package Banco;

public class Cuenta {
    
    private final String nombre;
    private final String paterno;
    private final String materno;
    private String domicilio;
    private  int telefono;

    public Cuenta(String nombre, String paterno, String materno, String domicilio, int telefono) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
