package com.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * CRUD => Create, Retrieve/Read, Update, Delete
 */
public class EmpleadoCRUD {
    // Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return this.empleados;
    }



}
