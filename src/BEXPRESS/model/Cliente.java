
package BEXPRESS.model;

public class Cliente {
    private int id;
    private String nombre;
    private String dni;   // DNI/RUC (único)
    private String telefono;
    private String email;
    private String direccion;
    private String fechaRegistro;

    public Cliente(int id, String nombre, String dni, String telefono, String email, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public boolean esValido() {
        return nombre != null && !nombre.isBlank()
            && dni != null && dni.matches("\\d{8}|\\d{11}") // DNI(8) o RUC(11)
                && (telefono == null || telefono.isBlank() || telefono.matches("\\d{6,15}"))
            && (email == null || email.isBlank() || email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$"));
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ") - " + (direccion == null ? "" : direccion);
    }
    
    
}


