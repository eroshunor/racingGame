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
        car.setName("Dacia");
        car.setColor("blue");
        car.doorCount = 4;
        car.setMileage(9.5);
        car.setFuelLevel(50);
        car.setRunning(true);


        Car car1 = new Car(new Engine());
        car1.setName("Volvo");
        car1.setColor("green");
        car1.doorCount = 4;
        car1.setMileage = 8;
        car1.setFuelLevel = 60;
        car1.setRunning = true;

        Car car3 = car;

        System.out.println(car.getName());
        //System.out.println(car3.name);

        //System.out.println("Changing values...");

        car.getName = "Dacia Logan";

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

