import java.util.Scanner;

class MyFirstJavaProgram {
    public static void main(String[] args){
        //LOOPS, IF/ELSE, SWITCH STATEMENT

        //for(x;y;z){} loop = initialization, condition, iteration

        //while(y){} loop = condition only, iteration in code block

        //do{}while(y) loop = runs at least once then checks condition, iteration in code block

        //you can call methods in a switch statement

        //public keyword makes function usable in other java programs
        //static keyword indicates that it is a member of the class without need to instantiate
        //inside parenthesis is called deep parameters
        //-------------------------------------------------
        // Scanner intScanner = new Scanner(System.in);
        // int count = 0;

        // //while loop only accepts conditional and will loop until condition is false
        // while(count != 0){
        //     System.out.println("Count yeah!");
        //     count = 0;
        // }

        // do{
        //     System.out.println("Count: " + count);
        // }while(count != 0);

        // // Act 1
        // // user decides upper limit of count
        // int countUpperLimit;

        // System.out.println("Enter upper limit of count: ");
        // countUpperLimit = intScanner.nextInt();

        // for(count = 0; count <= countUpperLimit; count += 1){
        //     System.out.println("Count: " + count);
        // }
        // //

        // // Act 2
        // // user decides how many skips
        // int countIncrement = 1;

        // System.out.println("Enter increment count: ");
        // countIncrement = intScanner.nextInt();

        // for(count = 0; count <= 10; count += countIncrement){
        //     System.out.println("Count: " + count);
        // }
        // //

        // intScanner.close();




        // Training
        // int count;
        // initialization; condition - check if continue; increment/decrement 
        // for(count = 0; count <= 10; count += 2){
        //     System.out.println("Count: " + count);
        // }


        //Conditional
        //conditional operator: if else if else
        //comparative operator: < <= > >= == !=
        //inside bracket = code block
        // if(5 == 5){
        //     System.out.println("John Doe");
        // }

        //== Problem with String
        // Scanner nameScanner = new Scanner(System.in);

        // String name;
        
        // System.out.println("What is your name?");
        // name = nameScanner.nextLine();

        // if(name == "John Doe"){
        //     System.out.println("The name given is John Doe.");
        // }
        // else{
        //     System.out.println("The name given is not John Doe.");
        // }

        // nameScanner.close();
        
        // Scanner ageScanner = new Scanner(System.in);

        // int age;
        
        // System.out.println("What is your age?");
        // age = ageScanner.nextInt();

        // if(age == 25){
        //     System.out.println("The age given is 25.");
        // }
        // else if(age == 30){
        //     System.out.println("The age give is 30.");
        // }
        // else{
        //     System.out.println("The age given is not 25 or 30.");
        // }

        // ageScanner.close();

        //Switch
        // Scanner ageScanner = new Scanner(System.in);

        // int age;
        
        // System.out.println("What is your age?");
        // age = ageScanner.nextInt();

        // switch(age){
        //     case 25: System.out.println("The age given is 25."); break;
        //     case 30: System.out.println("The age given is 30."); break;
        //     case 35: System.out.println("The age given is 35."); break;
        //     default: System.out.println("The age given is not 25, 30, or 35.");
        // }

        
        // else if(age == 30){
        //     System.out.println("The age give is 30.");
        // }
        // else{
        //     System.out.println("The age given is not 25 or 30.");
        // }

        // ageScanner.close();

        // activity = user asked for age. check if age < 18. if true then minor, if > 18 or < 60 then adult. if > 60, then elderly.
        
        // < 18 is MINOR, >= 18 AND <= 60 is ADULT, >60 is ELDERLY
        // Scanner ageScanner = new Scanner(System.in);

        // int age;
        
        // System.out.println("How old are you?");
        // age = ageScanner.nextInt();

        // if(age < 18){
        //     System.out.println("You are a minor.");
        // }
        // else if(age >= 18){
        //     if(age <= 60){
        //         System.out.println("You are an adult.");
        //     }
        //     else{
        //         System.out.println("You are an elderly person.");
        //     }
        // }

        // ageScanner.close();

        //easier solution from others:
        // do < 18, then less than 60, then else = does the same
    
    }
}