package com.poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado manolo = new Empleado("Manolo", 30, 40000, true);
        Empleado carlos = new Empleado("Carlos", 30, 40000, true);

        System.out.println("Juanito: " + juanito);

        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(manolo);
        empleadoCRUD.guardar(carlos);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println("Empleados: " + empleados);

    }

}
