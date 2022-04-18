public class CarActivity2 {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car("Dodge ATOS", "ATOS", "DODGE", 2004, "Warehouse Main, Labangon, Cebu");
        cars[1] = new Car("Alfa Romeo 147", "147", "ALFA ROMEO", 2006, "Warehouse Main, Labangon, Cebu");
        cars[2] = new Car("Ram RAM", "RAM", "RAM", 2014, "Warehouse Main, Labangon, Cebu");
        cars[3] = new Car("Husaberg FC550", "FC550", "HUSABERG", 2005, "Warehouse Main, Labangon, Cebu");
        cars[4] = new Car("Arctic Cat 700 LTD", "700 LTD", "ARCTIC CAT", 2014, "Warehouse Main, Labangon, Cebu");

        for(int index = 0; index < cars.length; index++) {
            int carNum = index + 1;
            System.out.println("=================");

            System.out.println("Car #" + carNum + " " + cars[index].getName());
            System.out.println("Current Location: " + cars[index].getLocation());
            
            if(carNum % 2 != 0){
                cars[index].travel("Warehouse Odd, Guadalupe, Cebu");
            }
            else {
                cars[index].travel("Warehouse Even, Guadalupe, Cebu");
            }

            System.out.println("> Now Traveling...");
            System.out.println("> Arrived at Destination");
            System.out.println("=================");
            System.out.println("Current Location: " + cars[index].getLocation());
        }
    }
}
