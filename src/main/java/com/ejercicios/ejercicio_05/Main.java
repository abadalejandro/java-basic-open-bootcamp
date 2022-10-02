package com.ejercicios.ejercicio_05;

import com.poo.coninterfaces.EmpleadoCRUD;
import com.poo.coninterfaces.EmpleadoCRUDMySQL;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {
        Coche renault_Clio = new Coche("Renault", "Clio", 4, "Verde", 20000, "Gasoil");
        Coche ford_Fiesta = new Coche("Ford", "Fiesta", 4, "Verde", 20000, "Gasoil");
        Coche fiat_punto = new Coche("Fiat", "Punto", 4, "Verde", 20000, "Gasoil");

        cocheCRUD.save(renault_Clio);
        cocheCRUD.save(ford_Fiesta);
        cocheCRUD.save(fiat_punto);
        cocheCRUD.findAll();
        cocheCRUD.delete(renault_Clio);

    }
}
