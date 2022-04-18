public class Main {
    public static void main(String[] args) {
        //For Inheritance (Single and Multilevel only)
        // CanFly pigeon = new CanFly();

        // CanFly.sing();

        // CanFly.hasFeathers();

        // CanFly.evolve();

        // System.out.println(pigeon.flightSpeed);

        //For Abstraction (Blueprint)
        //instantiating a new class is the same as creating an object in Javascript
        Person person1 = new Person("Victor", "Chiong", "No job");
        System.out.println("Hello, my name is " + person1.firstname + " " + person1.lastname);

        Person person2 = new Person("John", "Doe", "Teacher");
        System.out.println("Hello, my name is " + person2.firstname + " " + person2.lastname);

        Person person3 = new Person("Jane", "Doe");
        System.out.println("Hello, my name is " + person3.firstname + " " + person3.lastname);
    }
}
