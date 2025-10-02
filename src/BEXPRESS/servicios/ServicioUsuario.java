package BEXPRESS.servicios;

import BEXPRESS.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class ServicioUsuario {
    private final List<Usuario> usuarios = new ArrayList<>();
    private int siguienteId = 1;

    // Firma corregida con coma después de telefono
    public boolean registrar(String nombre, String email, String password, String telefono, String rol) {
        Usuario u = new Usuario(siguienteId, nombre, email, password, telefono, rol);
        if (!u.esValido()) return false;
        if (existePorNombre(nombre)) return false; // evita duplicados por nombre

        u.setId(siguienteId++);
        u.setFechaRegistro(Reloj.ahoraFechaHora()); // marca de tiempo
        usuarios.add(u);
        return true;
    }

    public List<Usuario> listar() {
        return new ArrayList<>(usuarios);
    }

    public Usuario buscarPorId(int id) {
        for (Usuario u : usuarios) if (u.getId() == id) return u;
        return null;
    }

    public boolean existePorNombre(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) return true;
        }
        return false;
    }

    public int contarUsuarios() {
        return usuarios.size();
    }
}

