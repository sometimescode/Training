public class Person {
    //private makes these attributes invisible outside of this class/not publically accessible
    //so getters and setters are needed
    //to access/change the values using methods from this class instead of directly manipulating them
    //outside of this class
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void speak(){
        System.out.println("Hello I am a person.");
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
}
