package org.fasttrackit;

public class Mechanic {

    public void repair(Vehicle vehicle) {
        System.out.println("Repairing vehicle " + vehicle.make);

        vehicle.totalTravelDistance -= 1000;

        vehicle.damaged = false;

    }
}
