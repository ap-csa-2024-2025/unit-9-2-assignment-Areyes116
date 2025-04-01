public class CarTester {
    public static void run() {
        // Create a Car object
        Car myCar = new Car("Toyota", 10);

        // Print out the model
        System.out.println("Car model: " + myCar.getModel());

        // Print out the fuelLevel
        System.out.println("Fuel level: " + myCar.getFuelLevel() + " gallons");

        // Print how many miles are left with 23 mpg
        System.out.println("Miles left: " + myCar.milesLeft(23) + " miles");

        // Print the object
        System.out.println(myCar);

        // Create an ElectricCar object
        ElectricCar myElectricCar = new ElectricCar("Tesla", 80);

        // Print out the model
        System.out.println("Car model: " + myElectricCar.getModel());

        // Print out the fuelLevel
        System.out.println("Battery level: " + myElectricCar.getFuelLevel() * 100 + "%");

        // Print how many miles are left with 400 miles per charge
        System.out.println("Miles left: " + myElectricCar.milesLeft(400) + " miles");

        // Print the object
        System.out.println(myElectricCar);
    }
}
