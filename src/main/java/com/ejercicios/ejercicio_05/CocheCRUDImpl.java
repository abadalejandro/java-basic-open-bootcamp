package com.ejercicios.ejercicio_05;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        this.coches.add(coche);
        System.out.println("***********************************************");
        System.out.println("save method");
//        System.out.println("save coche: " + coche.marca);
//        System.out.println("Lista coches: " + this.coches);
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("***********************************************");
//        System.out.println(this.coches);
        System.out.println("findAll method");
        return this.coches;
    }

    @Override
    public void delete(Coche coche) {
        this.coches.remove(coche);
        System.out.println("***********************************************");
        System.out.println("delete method");
//        System.out.println("delete coche: " + coche.marca);
//        System.out.println(this.coches);
    }
}
