package BEXPRESS.servicios;

import java.util.ArrayList;
import java.util.List;
import BEXPRESS.model.Producto;

public class ServicioProducto {
    private final List<Producto> productos = new ArrayList<>();
    private int siguienteId = 1; // autoincremento

    // Crear
    public boolean registrar(String nombre, double precio, int stock, String categoria) {
        if (nombre == null || nombre.isBlank()) return false;
        if (categoria == null || categoria.isBlank() || "-".equals(categoria)) return false;
        if (precio < 0 || stock < 0) return false;

        Producto p = new Producto(siguienteId++, nombre.trim(), precio, stock, categoria.trim());
        productos.add(p);
        return true;
    }

    // Listar
    public List<Producto> listar() {
        return productos; // referencia simple; si quieres, devuelve una copia
    }

    // Buscar
    public Producto buscarPorId(int id) {
        for (Producto p : productos) if (p.getId() == id) return p;
        return null;
    }

    // Actualizar
    public boolean actualizar(Producto actualizado) {
        if (actualizado == null || !actualizado.esValido()) return false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == actualizado.getId()) {
                productos.set(i, actualizado);
                return true;
            }
        }
        return false;
    }

    // Eliminar
    public boolean eliminar(int id) {
        return productos.removeIf(p -> p.getId() == id);
    }
}
