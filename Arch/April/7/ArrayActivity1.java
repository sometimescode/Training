import java.util.Scanner;

public class ArrayActivity1 {
    public static void main(String[] args){
        Scanner nameScanner = new Scanner(System.in);

        String persons[] = new String[5];

        int count;
        
        System.out.println("Activity 1");
        //ask user input for 5 names
        for(count = 0; count < persons.length; count += 1){
        System.out.println("Input Name of Person #" + (count + 1) + ":");
        persons[count] = nameScanner.nextLine();
        }

        //print persons array
        for(count = 0; count < persons.length; count += 1){
        System.out.println("Hello, my name is " + persons[count] + ".");
        }

        nameScanner.close();
    }
}
