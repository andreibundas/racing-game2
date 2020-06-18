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
        if(speed > maxSpeed) {                 // conditional statement
            System.out.println("Max speed exceeded.");
            return 0;
        } else if (speed > maxSpeed) {
            System.out.println("Carreful! Max speed reached! ");
        } else {
            System.out.println("Valid speed enetered.");
        }

        if(damaged) {
            System.out.println("The vehicle is dmaged. You cannot accelerate.");
            return 0;
        }



        System.out.println(make + " is accelerationg with " + speed + " kn/h for " + durationInHours + "h");

        // "distance" = local variable
        double distance = speed * durationInHours;
        totalTravelDistance = totalTravelDistance + distance;

       //same result as statement above
       // totalTravelDistance += distance;

        System.out.println("Total travel distance" + totalTravelDistance);

        double usedFuel = distance * mileage / 100;

        // todo: use more fuel if speed > 120 km/h;
        fuelLevel = fuelLevel - usedFuel;
        // fuelLevel = -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);


        return distance;
    }
  // return type : "void" nu necesita return
    public void makeSound() {
        System.out.println("Make way");

        return;  //- e inutil , nu trebuie indicat in cazul in care folosim return type: " void "
    }

}
