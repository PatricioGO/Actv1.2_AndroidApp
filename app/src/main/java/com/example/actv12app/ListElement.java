package com.example.actv12app;

public class ListElement {

    public String color;
    public String nombre;
    public String numero;
    public String status;

    public ListElement(String color, String nombre, String numero, String status) {
        this.color = color;
        this.nombre = nombre;
        this.numero = numero;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
