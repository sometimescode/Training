import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Scanner nameScanner = new Scanner(System.in);

        int sum;
        
        String name;

        // displayName("Victor");
        sum = addTwoNumbers(5, 10);

        System.out.println(sum);

        int anotherSum;

        anotherSum = addTwoNumbers(100,200);

        System.out.println(anotherSum);

        name = nameScanner.nextLine();

        System.out.println(displayName(name));
        name = nameScanner.nextLine();

        System.out.println(displayName(name));
    }

    public static String displayName(String name){
        return "My name is " + name + ".";
    }

    public static int addTwoNumbers(int num1, int num2){
        System.out.println(displayName("Bob from addTwoNumbers"));
        return num1 + num2;
    }
}
