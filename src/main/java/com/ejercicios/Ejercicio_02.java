package com.ejercicios;

public class Ejercicio_02 {
    public static void main(String[] args) {

        double precioConIva = getPrecioConIva(100);
        System.out.println("Precio con IVA: " + precioConIva);

    }


    static double getPrecioConIva(double precio){
        return precio * 1.21;
    }
}
