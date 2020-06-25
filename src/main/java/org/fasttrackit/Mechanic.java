package org.fasttrackit;

public class Mechanic {

    public void repair(Vehicle vehicle) {
        System.out.println("Repairing vehicle " + vehicle.getMake());

        vehicle.setTotalTravelDistance(vehicle.getTotalTravelDistance() - 1000);

        vehicle.setDamaged(false);

    }


}
