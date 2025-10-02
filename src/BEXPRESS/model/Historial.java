
package BEXPRESS.model;

public class Historial {
    private String fechaHora; // yyyy-MM-dd HH:mm
    private String accion;    // CATEGORIA_CREAR, PEDIDO_CREAR, etc.
    private String entidad;   // Categoria, Pedido, Entrega, etc.
    private int referenciaId;

    public Historial(String fechaHora, String accion, String entidad, int referenciaId) {
        this.fechaHora = fechaHora;
        this.accion = accion;
        this.entidad = entidad;
        this.referenciaId = referenciaId;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public int getReferenciaId() {
        return referenciaId;
    }

    public void setReferenciaId(int referenciaId) {
        this.referenciaId = referenciaId;
    }
    
    
    
}
