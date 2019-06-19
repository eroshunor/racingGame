package org.fasttrackit;

import java.time.LocalDate;


//inheritance or "is-a " relationship
public class Car extends AutoVehicle{

   public int setMileage;
   public int setFuelLevel;
   public boolean setRunning;
   public String getName;
   int doorCount;

   public Car(Engine engine) {
      super(engine);
   }

   public void setName(String dacia) {
   }
}