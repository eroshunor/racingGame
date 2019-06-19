package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 3;

        Car car = new Car(engine);
        car.name = "Dacia";
        car.color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.fuelLevel = 50;
        car.running = true;


        Car car1 = new Car(new Engine());
        car1.name = "Volvo";
        car1.color = "green";
        car1.doorCount = 4;
        car1.mileage = 8;
        car1.fuelLevel = 60;
        car1.running = true;

        Car car3 = car;

        System.out.println(car.name);
        //System.out.println(car3.name);

        //System.out.println("Changing values...");

        car.name = "Dacia Logan";

        //System.out.println(car.name);
        //System.out.println(car3.name);

        //System.out.println(car.maxSpeed);
        //System.out.println(car.engine);

            //engine



        //System.out.println(engine.manufacturer);

        car.engine = engine;

        System.out.println("With the below engine:");
        System.out.println(car.engine.manufacturer);
//ctr P +hint
        double distance = car.accelerate(60, 0.5);

        System.out.println("Distance in App.Main " + distance);
        }


    }

