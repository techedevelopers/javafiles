package Inheritance;

class Vehicle {
        private String make;
        private String model;
        private int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void start(){
            System.out.println("Inheritance.Vehicle is starting");
        }
        public void stop(){
            System.out.println("Inheritance.Vehicle does brake");
        }
        public void displayInfo(){
            System.out.println(make +" " + model + " " + year);
        }

}
    class Car extends Vehicle{
        private int numDoors;

    public Car(String make, String model, int year, int numDoors){
        super(make,model,year);
        this.numDoors = numDoors;
    }
    }
    class Motorcycle extends Vehicle{
    private int numCylinder;

    public Motorcycle(String make,String model, int year, int numCylinder){
        super (make, model, year);
        this.numCylinder =numCylinder;

    }
    }

    class ElectricVehicle extends Car{
    private int batteryCapacity;

    public ElectricVehicle(String make, String model, int year, int numDoors, int batteryCapacity){
        super(make,model,year,numDoors);
        this.batteryCapacity = batteryCapacity;
    }
        public void chargeBattery(){
            System.out.println("Battery is Charged at 100%");
        }
    }

    public class motorvehcileinheritance {
        public static void main(String[] args) {
            Car car = new Car("Tesla","Model Y",2023,4);
            car.start();
            car.displayInfo();
            car.stop();

            Motorcycle motorcycle = new Motorcycle("Harley-Davidson","Sportstar", 2023, 5);
            motorcycle.start();
            motorcycle.displayInfo();
            motorcycle.stop();

            ElectricVehicle electricVehicle = new ElectricVehicle("Tesla", "Model X", 2023,4,50);
            electricVehicle.start();
            electricVehicle.displayInfo();
            electricVehicle.chargeBattery();
            electricVehicle.stop();
        }
}