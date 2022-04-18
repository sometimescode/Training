class MyFirstJavaProgram {

    public static void main(String[] args){
        //Review
        /* 
            Encapsulation:
            - Whatever is inside {} curly braces only belongs to that particular section of code.
            You can't access things inside out, only outside in
            attributes in main class can be accessed in main function
            - isolating whatever variables, attributes, methods belongs to a class

            OOP VS PROCEDURAL (one file and all attributes and methods belong to that same file)

            Inheritance: 
            borrowing or copying other variables, methods from other class
            Types:
            Single - inherit from one class
            Multilevel - inherit from one class which inherits from another
            Hierarchical - not discussed for now, but it's when one class inherits from two classes

            Abstraction:
            variables are made private

            Polymorphism:
            - multiple forms of a constructor or method can be present
            - if methods of the same name is found in a class and also the class it extends to, it will use
            the method found in its own class

        */

        /*
            1st Activity = Create a Car Class
            attributes = Name, Model, Brand, Year, Location (initial of the car)
            methods = Travel (take in String place) Car will travel to that place and update Location variable

            Main.java -> main

            Instantiate a car and give it a name, model, brand, year, and current location

            Call the travel function and then pass the place that you want to travel

            Display current location, and after traveling, display the new location;

            2nd Activity = Create an array of cars
            For each car, instantiate and give values
            Display the current location
            Travel -> string place
            Display the location

            3rd Activity = Add another attribute: double gas (in liters)
            modify travel method = remove String location, no parameters
            ask for user input to - ask the place to travel to
            ask the distance (in kilometers) as well
            set the location to the place traveled
            call calculateGasUsed
            then set the gas of the car to gas deducted by the gas used

            create a method calculateGasUsed(double distance) that will
            calculate the gas used to travel to that place, assuming
            15.5 KM / liter of gas
            return gas used

            ex 
            31km = 2 litres, return 2;
            Gas = 10 L,
 
        */
    }
}