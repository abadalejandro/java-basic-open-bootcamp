package com.ejercicios.ejercicio_05;

public class Coche {
    String marca;
    String modelo;
    int numeroPuertas;
    String color;
    double precio;
    String tipoCombustible;

    public Coche() {
    }

    public Coche(String marca, String modelo, int numeroPuertas, String color, double precio, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
        this.precio = precio;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }
}
