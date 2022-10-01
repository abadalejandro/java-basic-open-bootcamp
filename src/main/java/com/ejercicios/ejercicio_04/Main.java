package com.ejercicios.ejercicio_04;

public class Main {
    public static void main(String[] args) {
        SmartDevice myPhone = new SmartPhone(5,"Samsung","A20","2323424", 32, true, 40,true);
        System.out.println("mySmartPhone: " + myPhone);

        SmartDevice myWatch = new SmartWatch(2,"Huaway","I24","1234324",32, false, true,false);
        System.out.println("mySmartWatch: " + myWatch);


    }
}
