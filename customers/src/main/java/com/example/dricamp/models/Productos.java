package com.example.dricamp.models;
import java.util.Date;

public class Productos {
    private int id;
    private String estado;
    private String categoria;
    private String presentacion;
    private String nombre;
    private double precio;
    private Date fechaProduccion;
    private String descripcion;

    public Productos() {

    }

    public Productos(int id, String estado, String categoria, String presentacion, String nombre, double precio, Date fechaProduccion, String descripcion) {
        this.id = id;
        this.estado = estado;
        this.categoria = categoria;
        this.presentacion = presentacion;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaProduccion = fechaProduccion;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(Date fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", categoria='" + categoria + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaProduccion=" + fechaProduccion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
