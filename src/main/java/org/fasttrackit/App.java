package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Welcome to the Racing Game!");

        Car carReference = new Car();
        System.out.println(carReference.make);

        carReference.make = "Skoda";
        carReference.model = "Fabia";
        carReference.mileage = 7.5;
        carReference.fuelLevel = 60;
        carReference.color = "red";
        carReference.maxSpeed = 300;

        // instantiere obiect engine direct in proprietatea engine a masinii ( Car)
        carReference.engine = new Engine();

        carReference.engine.manufacturer = "VW";
        carReference.engine.capacity = 1900;


        // creere obiect motor si atribuire proprietati
        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 1900;
        // stocare copie a acelui motor in proprietatea engine a masinii
        carReference.engine = engine1;

        // invocarea , folosirea, apelarea mtodei accelerate
        double currentDistance = carReference.accelerate(100, 0.5);  // distanta parcursa de masina in runda curenta




        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.color);
        System.out.println(carReference.maxSpeed);

        System.out.println(carReference.totalTravelDistance);
        System.out.println(carReference.damaged);
        System.out.println(carReference.doorCount);



        Car car2 = new Car();
        car2.make = "Mercedes";
        car2.model = "CLS";
        car2.color = "black";

        double car2distance = car2.accelerate(120, 3);

        car2.make = carReference.make;


        // concatenation
        System.out.println(car2.make + " " + carReference.make);

        System.out.println("Car2 make: " + car2.make);
        System.out.println("Carreference make : " + carReference.make);


        Car car2backup = car2;
        car2 = carReference;

        System.out.println("Initial name");
        System.out.println(car2.make);
        System.out.println(carReference.make);

        car2.make = "Audi";

        System.out.println("Update name");

        System.out.println(car2.make);
        System.out.println(carReference.make);


        // NPE (NullPointerException) examples
        // car2 = null;
        // System.out.println(car2.make);

        System.out.println("Modulo (modulus) examples: ");
        System.out.println(4 % 2);
        System.out.println(4 % 3);

        System.out.println("Is 4 even ?");
        System.out.println(4 % 2 == 0);

        System.out.println("Is 5 even ?");
        System.out.println(5 % 2 == 0);

        System.out.println("Is 5 not even ?");
        System.out.println(5 % 2 != 0);  // != neaga expresia care urmeaza se traduce cu nu este egal cu 0


    }
}
