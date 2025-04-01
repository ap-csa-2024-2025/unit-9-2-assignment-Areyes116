public class ElectricCar extends Car
{
    
    // Constructor
    public ElectricCar(String model, int batteryLevel)
	{
        super(model, batteryLevel); // Call the Car constructor
    }

    // Override getFuelLevel
    @Override
    public double getFuelLevel()
	{
        return super.getFuelLevel() / 100.0; // Convert to percentage
    }

    // Override milesLeft
    @Override
    public double milesLeft(double milesOnFullCharge)
	{
        return getFuelLevel() * milesOnFullCharge; // Compute miles left based on battery percentage
    }

    // Override toString
    @Override
    public String toString()
	{
        return super.getModel() + " electric car";
    }
}
