import java.util.Scanner;

public class Car {
    //activity 1
    private String name;
    private String model;
    private String brand;
    private int year;
    private String location;
    //activity 3
    private double gas;
    //activity 4 but also used in 3 to hold the fixed value (15.5)
    private double gasConsumption;

    //activity 1
    public Car(String name, String model, String brand, int year, String location) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
    }

    //activity 3
    public Car(String name, String model, String brand, int year, String location, double gas) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
        this.gas = gas;
        this.gasConsumption = 15.5;
    }

    //activity 4
    public Car(double gasConsumption, String name, String model, String brand, int year, String location, double gas) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
        this.gas = gas;
        this.gasConsumption = gasConsumption;
    }


    //activity 3, gasConsumption was fixed value (15.5), but since activity 4 added gasConsumption, it's being used instead
    public double calculateGasUsed(double distance) {
        return distance / gasConsumption;
    }


    //activity 1
    public void travel(String place){
        this.location = place;
    }

    //activity 3
    public void travel(Scanner inputScanner){
        String newLocation;
        double distance;
        double gasUsed;
        
        System.out.println("Gas: " + this.gas + " l");
        System.out.println("Gas Consumption: " + this.gasConsumption + " km/l");
        
        System.out.println("Please enter travel destination: ");
        newLocation = inputScanner.nextLine();
        System.out.println("Please enter the distance (km) between the two locations: ");
        distance = inputScanner.nextDouble();
        inputScanner.nextLine();
        
        this.location = newLocation;
        gasUsed = calculateGasUsed(distance);
        this.gas = this.gas - gasUsed;
    }

    //getters and setters for all attributes of class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }
}
