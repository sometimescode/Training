public class Police extends Person{
    private String rank;

    //class you're inheriting from has a constructor, so you need to call that constructor
    //by using the super keyword within this class' constructor
    public Police(String firstname, String lastname, String rank){
        super(firstname, lastname);
        this.rank = rank;
    }

    public void speak() {
        System.out.println("Hello I am a Police");    
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    
}
