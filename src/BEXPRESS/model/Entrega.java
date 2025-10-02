/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BEXPRESS.model;

public class Entrega {
    private int id;
    private int pedidoId;
    private String direccion;
    private String contacto;
    private String telefono;
    private String responsable;
    private String fechaHoraEstimada; // yyyy-MM-dd HH:mm
    private String fechaHoraEntrega;  // yyyy-MM-dd HH:mm (null si no entregado)
    private String estado;            // Pendiente / En ruta / Reprogramado / Entregado

    public Entrega(int id, int pedidoId, String direccion, String contacto, String responsable, String fechaHoraEstimada) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.direccion = direccion;
        this.contacto = contacto;
        this.responsable = responsable;
        this.fechaHoraEstimada = fechaHoraEstimada;
        this.estado = "Pendiente";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getFechaHoraEstimada() {
        return fechaHoraEstimada;
    }

    public void setFechaHoraEstimada(String fechaHoraEstimada) {
        this.fechaHoraEstimada = fechaHoraEstimada;
    }

    public String getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(String fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
