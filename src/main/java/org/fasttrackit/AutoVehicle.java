package org.fasttrackit;

import org.fasttrackit.vehicle.Engine;

public class AutoVehicle extends Vehicle {

    // "has-a" relationship ( Agregation)
    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    // in constructor se pot introduce orice fel de instructiuni - nu doar instructiuni de atribuire
        System.out.println("Bilding an auto-vehicle");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
