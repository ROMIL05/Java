// 1. Define the Interface
interface Vehicle {
    int vehicleNo = 10;	//public, static and final
    void start();  // Method to start the vehicle
    void stop();   // Method to stop the vehicle
}

// 2. Implement the Interface for Car
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with key ignition...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping with hydraulic brakes...");
    }
}

// 3. Implement the Interface for Bike
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with self-start or kick...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping with disc brakes...");
    }
}

// 4. Implement the Interface for Truck
class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting with a heavy-duty engine...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping with air brakes...");
    }
}

// 5. Test the Implementation
public class VehicleBasic {
    public static void main(String[] args) {
        // Creating objects of different vehicle types
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        // Testing each vehicle
        myCar.start();
        // myCar.vehicleNo = 20; ERROR
        System.out.println("Vehicle No is: " + myCar.vehicleNo);
        myCar.stop();

        myBike.start();
        myBike.stop();

        myTruck.start();
        myTruck.stop();
    }
}
