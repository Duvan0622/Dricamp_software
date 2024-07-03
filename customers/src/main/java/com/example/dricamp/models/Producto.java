package com.example.dricamp.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

    @Column(name="id")
    @Id
    private int id;
    @Column(name="estado")
    private String estado;
    @Column(name="categoria")
    private String categoria;
    @Column(name="presentacion")
    private String presentacion;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private double precio;
    @Column(name="fecha")
    private String fechaProduccion;
    @Column(name="descripcion")
    private String descripcion;

    public Producto() {

    }

    public Producto(int id, String estado, String categoria, String presentacion, String nombre, double precio, String fechaProduccion, String descripcion) {
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

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(String fechaProduccion) {
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
