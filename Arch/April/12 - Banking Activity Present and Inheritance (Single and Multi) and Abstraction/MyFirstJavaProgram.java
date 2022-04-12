class MyFirstJavaProgram {

    //attributes of the class, can be accessed anywhere inside the class because it's initialized outside of other
    //methods in a class
    static int age = 20;
    static String name = "Victor";
    static String school = "USC";

    public static void main(String[] args){
        //OOP 4 concepts: encapsulation, inheritance, abstraction (blueprint), polymorphism
        //unlike procedural programming, methods aren't contained in one program
        //Encapsulation
        /*
            imagine your java class as a capsule containing variables and methods
            attributes and methods that belong to a class are considered members of that particular class
        */
        //Scope of a Code
        /*
            so far, hierarchy and when variables can and cannot be used based on where they are
        */
        //Inheritance
        /*
            concept of a class inheriting methods or attributes from another class
            methods to inherit:
            1) single inheritance -> one class will inherit another class
                ex Person class has name, lastname, and introduction method
                Police class inherits person's variables and methods and also has its own
                variables rank, salary, and unit_no
            2) multilevel -> one class inherited by another class which is inherited by another class
                ex Biological Being class has evolve function.
                A Person class can also evolve, so it inherits Biological Being while keeping its own
                members (name, lastname)
                A Bird class can also evolve, so it inherits Biological Being while keeping its own 
                members (sing, fly)
                A Tucan class is a bird that can sing and fly, so it inherits Bird while keeping its own
                specific members (...)
                A Pigeon class is a bird that can sing and fly, so it inherits Bird while keeping its own

                ex. You have a Bird class with sing and feather
                You have a CanFly and CantFly classes inheriting Bird class.
                CanFly has flightSpeed and CantFly has walkSpeed
                Pigeon Class and Tucan inherit CanFly. (ex Tucan can evolve, fly, sing, feather,)
                Chicken and Kiwi inherit CantFly
            3) hierarchical -> two classes being inherited by one class
        */
        //Abstraction
        /*
            solves consistency issue between things of the same type
        */


        age = 50;
        System.out.println(age);
        System.out.println(school);
    }

    public static void display() {
        String school = "USC";
        System.out.println(school);
    }
}