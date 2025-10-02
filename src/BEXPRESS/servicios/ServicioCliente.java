package BEXPRESS.servicios;

import BEXPRESS.model.Cliente;
import java.util.ArrayList;
import java.util.List;



public class ServicioCliente {
    private final List<Cliente> clientes = new ArrayList<>();
    private int siguienteId = 1;

    // Crear (valida + evita duplicado por DNI/RUC)
    public boolean registrar(String nombre, String dni, String telefono, String email, String direccion) {
        Cliente c = new Cliente(siguienteId, nombre, dni, telefono, email, direccion);
        if (!c.esValido()) return false;
        if (existePorDni(dni)) return false;

        c.setId(siguienteId++);
        c.setFechaRegistro(Reloj.ahoraFechaHora());
        clientes.add(c);
        return true;
    }

    // Listar (copia)
    public List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }

    // Buscar
    public Cliente buscarPorId(int id) {
        for (Cliente c : clientes) if (c.getId() == id) return c;
        return null;
    }

    public Cliente buscarPorDni(String dni) {
        for (Cliente c : clientes) if (c.getDni().equals(dni)) return c;
        return null;
    }

    public boolean existePorDni(String dni) {
        return buscarPorDni(dni) != null;
    }

    // Actualizar (mantiene fechaRegistro)
    public boolean actualizar(Cliente actualizado) {
        if (actualizado == null || !actualizado.esValido()) return false;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == actualizado.getId()) {
                // si cambia DNI, valida que no duplique
                if (!clientes.get(i).getDni().equals(actualizado.getDni()) && existePorDni(actualizado.getDni())) {
                    return false;
                }
                actualizado.setFechaRegistro(clientes.get(i).getFechaRegistro());
                clientes.set(i, actualizado);
                return true;
            }
        }
        return false;
    }

    // Eliminar físico (si prefieres lógico, cambia a un flag)
    public boolean eliminar(int id) {
        return clientes.removeIf(c -> c.getId() == id);
    }
}


