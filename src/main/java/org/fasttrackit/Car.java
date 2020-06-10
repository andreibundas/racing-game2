package org.fasttrackit;

public class Car {

    // JAVA un limbaj de programare - Strong-Typed - adica trebuie sa specificam tipul datelor ( String, double, boolean etc)
    // spre deosebire, Java Script este un limbaj de programare weak-typed, in sensul in care
    // se pot declara variable la modul general: var  ( fara nominalizare )

    // insance variables
    String make;  // marca
    String model;  // model
    String color;
    double mileage;  // consumul mediu
    double fuelLevel;
    double maxSpeed;
    double totalTravelDistance;
    boolean damaged;
    int doorCount;

    // "has-a" relationship ( Agregation)
    Engine engine;


}
