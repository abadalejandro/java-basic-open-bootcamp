package com.poo.coninterfaces;

import com.poo.sininterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);


}
