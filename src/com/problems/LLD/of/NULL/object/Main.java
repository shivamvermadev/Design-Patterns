package com.problems.LLD.of.NULL.object;


/**
 * Problem the below method has a possibility of throwing NullPointerException
 * The question is you should not use null check on the object vehicle ex if (vehicle != null), this check should not be used.
  private static void printVehicleDetails(Vehicle vehicle) {
   System.out.println("Seating capacity " + vehicle.getSeatingCapacity());
   System.out.println("Seating capacity " + vehicle.getTankCapacity());
 }

 Here comes the NULL object design pattern
 1) A null object replaces NULL return type
 2) No need to put if check for checking null
 3) NULL object reflects do Nothing or Default behaviour
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
