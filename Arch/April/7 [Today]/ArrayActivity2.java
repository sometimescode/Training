import java.util.Scanner;

public class ArrayActivity2 {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        int personSize = 5;

        String personsName[] = new String[personSize];
        int personsAge[] = new int[personSize];

        int count;
        
        System.out.println("Activity 2");
        //ask user input for name and age 5 times
        for(count = 0; count < personSize; count += 1){
        System.out.println("Input Person #" + (count + 1));
        System.out.println("Name: ");
        personsName[count] = inputScanner.nextLine();
        System.out.println("Age: ");
        personsAge[count] = inputScanner.nextInt();
        //from SO
        inputScanner.nextLine();
        }

        //print personsName and personsName array
        for(count = 0; count < personsName.length; count += 1){
        System.out.println("Hello, my name is " + personsName[count] + " and my age is " + personsAge[count] + ".");
        }

        inputScanner.close();
    }  
}
