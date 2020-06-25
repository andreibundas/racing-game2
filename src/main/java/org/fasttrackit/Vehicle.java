package org.fasttrackit;

public class Vehicle extends Object  {

    // class variable / static variable
    private static int totalVehicleCount;


    // insance variables
    private String make;  // marca
    private String model;  // model
    private String color;
    private double mileage;  // consumul mediu
    private double fuelLevel;
    private double maxSpeed;
    private double totalTravelDistance;
    private boolean damaged;


    public Vehicle() {
        totalVehicleCount++;
    }


//    public double accelerate(double speed) {
//        return accelerate();
//    }


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

        //  use more fuel if speed > 120 km/h;
        double milageMultiplier = 1;
          if (speed > 120) {
            milageMultiplier = speed / 100;
        }
        double usedFuel = distance * mileage / 100;
        usedFuel *= milageMultiplier;


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


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.trim();  // .trim  - o metoda din clasa Strim -> sterge spatiile de la inceput si de la sfarsit
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTotalTravelDistance() {
        return totalTravelDistance;
    }

    public void setTotalTravelDistance(double totalTravelDistance) {
        this.totalTravelDistance = totalTravelDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }

    public static void setTotalVehicleCount(int totalVehicleCount) {
        Vehicle.totalVehicleCount = totalVehicleCount;
    }
}
