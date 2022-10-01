package com.ejercicios.ejercicio_04;

public class SmartDevice {

    int screenInch;
    String brand;
    String model;
    String serialNumber;
    int ram;

    SmartDevice() {
    }

    public SmartDevice(int screenInch, String brand, String model, String serialNumber, int ram) {
        this.screenInch = screenInch;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "screenInch=" + screenInch +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", ram=" + ram +
                '}';
    }
}


class SmartPhone extends SmartDevice {
    boolean dualSim;
    int photocameraResolution;
    boolean hasDactilarSensor;

    SmartPhone() {
    }

    public SmartPhone(int screenInch, String brand, String model, String serialNumber, int ram, boolean dualSim, int photocameraResolution, boolean hasDactilarSensor) {
        super(screenInch, brand, model, serialNumber, ram);
        this.dualSim = dualSim;
        this.photocameraResolution = photocameraResolution;
        this.hasDactilarSensor = hasDactilarSensor;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "dualSim=" + dualSim +
                ", photocameraResolution=" + photocameraResolution +
                ", hasDactilarSensor=" + hasDactilarSensor +
                ", screenInch=" + screenInch +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", ram=" + ram +
                '}';
    }
}

class SmartWatch extends SmartDevice {
    boolean isSubmersible;
    boolean hasCountSteps;
    boolean hasPulseMeasure;

    SmartWatch() {
    }

    public SmartWatch(int screenInch, String brand, String model, String serialNumber, int ram, boolean isSubmersible, boolean hasCountSteps, boolean hasPulseMeasure) {
        super(screenInch, brand, model, serialNumber, ram);
        this.isSubmersible = isSubmersible;
        this.hasCountSteps = hasCountSteps;
        this.hasPulseMeasure = hasPulseMeasure;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "isSubmersible=" + isSubmersible +
                ", hasCountSteps=" + hasCountSteps +
                ", hasPulseMeasure=" + hasPulseMeasure +
                ", screenInch=" + screenInch +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", ram=" + ram +
                '}';
    }
}



