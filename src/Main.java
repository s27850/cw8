import java.util.ArrayList;

public class Main {
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Car car = new Car("Ana", "XYZ", 2020, 200, 100);
        System.out.println(car.calculateFuelEfficiency());

        Car car2 = new Car("Ford", "kuga", 2018, 391, 30);
        System.out.println(car2.calculateFuelEfficiency());

        Truck truck = new Truck("Man", "new", 2023, 100, 26, 200);
        System.out.println(truck.calculateFuelEfficiency());

        System.out.println(vehicles);

    }
}