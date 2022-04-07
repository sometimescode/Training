import java.util.Scanner;

class LoopAct1 {
    public static void main(String[] args){
        // Act 1
        // user decides upper limit of count
        Scanner intScanner = new Scanner(System.in);
        int count, countMax;

        System.out.println("Enter max value for count: ");
        countMax = intScanner.nextInt();

        for(count = 0; count <= countMax; count += 1){
            System.out.println("Count: " + count);
        }
        
        intScanner.close();
    }
}