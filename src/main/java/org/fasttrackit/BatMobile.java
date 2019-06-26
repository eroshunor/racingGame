package org.fasttrackit;

public class BatMobile extends Vehicle {



        @Override
        //semnatura/ 1 sor
        public double accelerate(double speed, double durationInHours) {
            // concatenation
            System.out.println(getName() + " is accelerating with "
                    + speed + " km/h for " + durationInHours + "h.");

            double distance = speed * durationInHours * 2;
            System.out.println("Traveled " + distance + " km. Cheater!");

            setTraveledDistance(getTraveledDistance()+ distance);
            // logs
            System.out.println("Total traveled distance: " + getTraveledDistance() + " km.");


            return distance;

            //method signature must be the same except
            //1. co-variant return type & 2. Overriding method can allow larger access than was allowes in the super-class
            //@Override
            //        protected  Vehicle clone() throws CloneNotSupportedException {
            //    return  new Vehicle()
            //}
    }
}
