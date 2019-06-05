package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.running = true;


        Car car1 = new Car();
        car1.name = "Volvo";
        car1.color = "green";
        car1.doorCount = 4;
        car1.mileage = 8;
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

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 3;

        //System.out.println(engine.manufacturer);

        car.engine = engine;

        System.out.println("With the below engine:");
        System.out.println(car.engine.manufacturer);


        }


    }

