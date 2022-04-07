import java.util.Scanner;

class LoopAct2 {
    public static void main(String[] args){
        // Act 2
        // user decides how many skips
        Scanner intScanner = new Scanner(System.in);
        int count, countIncrement;

        System.out.println("Enter increment value for loop: ");
        countIncrement = intScanner.nextInt();

        for(count = 0; count <= 10; count += countIncrement){
            System.out.println("Count: " + count);
        }
        
        intScanner.close(); 
    }
}