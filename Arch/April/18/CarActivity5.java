import java.util.Scanner;

public class CarActivity5 {
    public static void main(String[] args) {
        //"Ford F-450", "F-450", "FORD", 2001
        //"Ford E-150", "E-150", "FORD", 2008
        Scanner inputScanner = new Scanner(System.in);
        Ford[] cars = new Ford[2];
        
        for(int i = 0; i < cars.length; i++) {
            cars[i] = initializeCar(inputScanner);
        }
        
        for(int i = 0; i < cars.length; i++) {
            System.out.println("=================");
            System.out.println("[" + cars[i].getName() + "]");
            System.out.println("Current Location: " + cars[i].getLocation());
            System.out.println("=================");

            cars[i].travel(inputScanner);
            
            System.out.println("=================");
            System.out.println("> Now Traveling...");
            System.out.println(cars[i].getCarSound());
            System.out.println("> Arrived at Destination");
            System.out.println("=================");
            System.out.println("Current Location: " + cars[i].getLocation());
            System.out.println("Gas: " + cars[i].getGas() + " l");
        }

        System.out.println("=================");
        
        for(int i = 0; i < cars.length; i++) {
            displayCarDetails(cars[i]);
        }

        inputScanner.close();

    }

    public static void displayCarDetails(Ford car) {
        System.out.println("[Car Details]");
        System.out.println("Name: " + car.getName());
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Gas: " + car.getGas());
        System.out.println("Gas Consumption: " + car.getGasConsumption());
        System.out.println("Location: " + car.getLocation());
        System.out.println("Car Sound: " + car.getCarSound());
        System.out.println("=================");
    }

    public static Ford initializeCar(Scanner inputScanner) {
        String name, model, brand, location, carSound;
        int year;
        double gasConsumption, gas;

        System.out.println("[Input Details for Car]");
        System.out.println("Name: ");
        name = inputScanner.nextLine();
        System.out.println("Model: ");
        model = inputScanner.nextLine();
        System.out.println("Brand: ");
        brand = inputScanner.nextLine();
        System.out.println("Year: ");
        year = inputScanner.nextInt();

        inputScanner.nextLine();

        System.out.println("Location: ");
        location = inputScanner.nextLine();
        System.out.println("Gas (l): ");
        gas = inputScanner.nextDouble();
        System.out.println("Gas Consumption (km/l): ");
        gasConsumption = inputScanner.nextDouble();

        inputScanner.nextLine();

        System.out.println("Car Sound: ");
        carSound = inputScanner.nextLine();

        System.out.println("=================");

        return new Ford(carSound, gasConsumption, name, model, brand, year, location, gas);
    }
}
