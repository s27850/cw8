public class Car extends Vehicle {
    double milesDriven;
    double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public double calculateFuelEfficiency(){
        return this.milesDriven/this.fuelConsumed;
    }
}
