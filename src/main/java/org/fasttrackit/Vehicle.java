package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    private static int totalCount;

    public Vehicle(){
        totalCount++;
    }

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;
    private LocalDate createdDate;


    public static int getTotalCount() {
        return totalCount;
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public double accelerate(double speed, double durationInHours){
        //concatenation
        System.out.println(name + " is accelerating " + speed + " km/h for " + durationInHours + " h. ");

        double distance = speed * durationInHours;

        System.out.println("Traveled " + distance + " km. ");

        traveledDistance = traveledDistance + distance;
        //traveledDistance += distance;
        //+ same result as the above state
        //logs
        System.out.println("total traveled distance: " + traveledDistance + " km. ");

        double spentFuel = distance/100 * mileage;
        System.out.println("Spent fuel " + spentFuel + " l.");

        fuelLevel = fuelLevel - spentFuel;
        //fuelLevel -= spentFuel;
        //+ same as the above state
        System.out.println("Remaningin fuel: " + fuelLevel + " l.");

        return distance;

    }
}
