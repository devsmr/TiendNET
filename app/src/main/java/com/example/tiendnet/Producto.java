package com.example.tiendnet;

public class Producto {
    private String id;
    private String nombre;
    private String cantidad;
    private String precio;

    public Producto(String id, String nombre, String cantidad, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.agregar(this);
    }

    public void eliminar(){
        Datos.eliminar(this);
    }

    public void editar(){
        Datos.editar(this);
    }
}
