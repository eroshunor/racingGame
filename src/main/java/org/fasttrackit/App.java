package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
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

        Car car2 = new Car(engine);
        car2.setName("Dacia2");
        car2.setColor("blue");
        car2.doorCount = 4;
        car2.setMileage(9.5);
        car2.setFuelLevel(50);
        car2.setRunning(true);

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

        // demo for static variables
//        System.out.println("Studying  static variables...");
//
//        car.totalCount = 1;
//
//        System.out.println("Total count from car: " + car.totalCount);
//
//        car1.totalCount = 2;
//
//        // static -> nem cserelodik
//
//        System.out.println("Total count from car after setting car 2: " + car.totalCount);
//
//        System.out.println("Total count from car: " + car1.totalCount);
//
//        System.out.println("Total caount from vehile class: " + Vehicle.totalCount);
//        }

        System.out.println("Total car number: " + car.getTotalCount());


    }
    }


