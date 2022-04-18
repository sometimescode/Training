import java.util.Scanner;

public class Car {
    private String name;
    private String model;
    private String brand;
    private int year;
    private String location;
    private double gas;

    public Car(String name, String model, String brand, int year, String location) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
    }

    public Car(String name, String model, String brand, int year, String location, double gas) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
        this.gas = gas;
    }

    public double calculateGasUsed(double distance) {
        double kmPerLitreofGas = 15.5;

        return distance / kmPerLitreofGas;
    }

    public void travel(String place){
        this.location = place;
    }

    public void travel(){
        String newLocation;
        double distance;
        double gasUsed;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter travel destination: ");
        newLocation = inputScanner.nextLine();
        System.out.println("Please enter the distance (km) between the two locations: ");
        distance = inputScanner.nextDouble();
        this.location = newLocation;
        gasUsed = calculateGasUsed(distance);
        this.gas = this.gas - gasUsed;

        inputScanner.close();
    }

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
}
