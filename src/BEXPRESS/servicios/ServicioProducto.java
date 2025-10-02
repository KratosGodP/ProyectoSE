package BEXPRESS.servicios;

import java.util.ArrayList;
import java.util.List;
import BEXPRESS.model.Producto;

public class ServicioProducto {

    private final List<Producto> productos = new ArrayList<>();
    private int siguienteId = 1; // autoincremento

    // Crear
    public boolean registrar(String nombre, double precio, int stock, String categoria) {

        if (nombre == null || nombre.isBlank()) {
            return false;
        }
        if (categoria == null || categoria.isBlank() || "-".equals(categoria)) {
            return false;
        }
        if (precio <= 0 || stock <= 0) {
            return false;
        }

        Producto p = new Producto(siguienteId++, nombre.trim(), precio, stock, categoria.trim());
        p.setFecha(java.time.LocalDate.now().toString()); // "yyyy-MM-dd"
        productos.add(p); // ✅ solo se agrega una vez

        return true;
    }

    // Listar
    public List<Producto> listar() {
        // devuelve una copia, no la referencia real
        return new ArrayList<>(productos);
    }

    // Buscar
    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    public List<Producto> buscarPorNombre(String nombre) {
    List<Producto> resultados = new ArrayList<>();
    for (Producto p : productos) {
        if (p.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
            resultados.add(p);
        }
    }
    return resultados;
}

    // Actualizar
    public boolean actualizar(Producto actualizado) {
        if (actualizado == null || !actualizado.esValido()) {
            return false;
        }
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == actualizado.getId()) {
                // conserva la fecha original
                actualizado.setFecha(productos.get(i).getFecha());
                productos.set(i, actualizado); // reemplaza
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

