package org.fasttrackit;

public class Vehicle extends Object  {

    // insance variables
    String make;  // marca
    String model;  // model
    String color;
    double mileage;  // consumul mediu
    double fuelLevel;
    double maxSpeed;
    double totalTravelDistance;
    boolean damaged;

     // Declararea Metodei
    public double accelerate(double speed, double durationInHours) {
        System.out.println(make + " is accelerationg with " + speed + " kn/h for " + durationInHours + "h");

        double distance = speed * durationInHours;
        totalTravelDistance = totalTravelDistance + distance;

       //same result as statement above
       // totalTravelDistance += distance;

        System.out.println("Total travel distance" + totalTravelDistance);

        double usedFuel = distance * mileage / 100;
        fuelLevel = fuelLevel - usedFuel;
        // fuelLevel = -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);


        return distance;
    }


}
