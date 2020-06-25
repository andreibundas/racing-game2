package org.fasttrackit.vehicle.Chapter2.cheater;

import org.fasttrackit.Vehicle;

public class CheatingVehicle extends Vehicle {


    // constant
    public static final String TYPE = "Cheater";

    @Override
    public double accelerate(double speed, double durationInHours) {
        // System.out.println(getMake() + " is accelerationg with " + speed + " kn/h for " + durationInHours + "h");

        double distance = speed * durationInHours * 2;

        return distance;
    }



}
