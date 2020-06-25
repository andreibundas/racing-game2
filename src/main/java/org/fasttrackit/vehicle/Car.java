package org.fasttrackit.vehicle;
  // is a relationship (inheritance)

import org.fasttrackit.AutoVehicle;

public class Car extends AutoVehicle {

    // JAVA un limbaj de programare - Strong-Typed - adica trebuie sa specificam tipul datelor ( String, double, boolean etc)
    // spre deosebire, Java Script este un limbaj de programare weak-typed, in sensul in care
    // se pot declara variable la modul general: var  ( fara nominalizare )


    private int doorCount;


    public Car(Engine engine) {

        super(engine);
    }

    // constructor overloading - in rom: supraincarcare
    public Car() {
        this(new Engine());
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
