package com.ejercicios;

public class Ejercicio_03 {
    public static void main(String[] args) {
        String[] nombres = {"Marta", "Eleonor", "Michela", "Laura"};
        String result = "";
        for (String nombre : nombres) {
            result+= nombre + " ";
        }

        System.out.println(result);
    }


}
