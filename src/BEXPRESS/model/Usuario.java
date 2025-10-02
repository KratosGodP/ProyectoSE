package BEXPRESS.model;

public class Usuario {
    private int id;
    private String nombre;
    private String email;     // opcional, puede ser único si quieres
    private String password;
    private String telefono;
    private String rol;       // ADMIN / OPERADOR
    private String fechaRegistro; // yyyy-MM-dd HH:mm

    public Usuario(int id, String nombre, String email, String password,String telefono, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.rol = rol;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTelefono() {
        return telefono;
    }
    
    

    
@Override
    public String toString() {
        return nombre + " (" + rol + ")";
    }

    // Validación simple
   public boolean esValido() {
        return nombre != null && !nombre.isBlank()
            && (email == null || email.isBlank() || email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$"))
            && password != null && password.length() >= 6
            && telefono != null && telefono.matches("\\d{6,15}")
            && rol != null && !rol.isBlank();
    }
}

