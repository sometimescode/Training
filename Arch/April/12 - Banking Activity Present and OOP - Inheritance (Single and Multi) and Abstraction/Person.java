public class Person {
    //not static, so this means it does not belong statically on class Person.
    //so you need to instantiate this class to access these values
    String firstname;
    String lastname;
    String job;

    public Person(String firstname, String lastname, String job) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job; 
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = "No job";
    }
}
