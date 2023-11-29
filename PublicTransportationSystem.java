// Outer class representing a Public Transportation System
class PublicTransportationSystem {
  
    // Nested class representing a Vehicle in the transportation system
    static class Vehicle {
        String vehicleType;
        int capacity;

        // Constructor for the Vehicle class
        Vehicle(String type, int capacity) {
            this.vehicleType = type;
            this.capacity = capacity;
        }

        // Method to display information about the vehicle
        void displayInfo() {
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Capacity: " + capacity + " passengers");
        }
    }

    // Inner class representing a Passenger in the transportation system
    class Passenger {
        String name;
        int age;

        // Constructor for the Passenger class
        Passenger(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display information about the passenger
        void displayInfo() {
            System.out.println("Passenger Name: " + name);
            System.out.println("Age: " + age + " years");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the PublicTransportationSystem class
        PublicTransportationSystem transportationSystem = new PublicTransportationSystem();

        // Creating an instance of the Vehicle class (nested class)
        PublicTransportationSystem.Vehicle bus = new PublicTransportationSystem.Vehicle("Bus", 50);

        // Displaying information about the vehicle
        System.out.println("Vehicle Information:");
        bus.displayInfo();

        // Creating an instance of the Passenger class (inner class)
        PublicTransportationSystem.Passenger passenger = transportationSystem.new Passenger("John Doe", 25);

        // Displaying information about the passenger
        System.out.println("\nPassenger Information:");
        passenger.displayInfo();

        // Demonstrating String class
        String route = "City Center to Suburb Station";
        System.out.println("\nRoute: " + route);

        // Demonstrating StringBuffer class
        StringBuffer schedule = new StringBuffer("Morning: 8:00 AM - 10:00 AM");
        schedule.append("\nEvening: 5:00 PM - 7:00 PM");
        System.out.println("Schedule:\n" + schedule);
    }
}
