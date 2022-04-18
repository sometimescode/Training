import java.util.Scanner;

public class CarActivity3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Car car1 = new Car("Ford F-450", "F-450", "FORD", 2001, "Elizabeth Mall, Sanciangko St, Cebu City", 10);

        System.out.println("[Car Information]");
        System.out.println("Name: " + car1.getName());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("=================");

        System.out.println("Current Location: " + car1.getLocation());
        System.out.println("=================");

        car1.travel(inputScanner);

        System.out.println("=================");
        System.out.println("> Now Traveling...");
        System.out.println("> Arrived at Destination");
        System.out.println("=================");
        System.out.println("Current Location: " + car1.getLocation());
        System.out.println("Gas: " + car1.getGas() + " l");

        inputScanner.close();
    }
    
}
