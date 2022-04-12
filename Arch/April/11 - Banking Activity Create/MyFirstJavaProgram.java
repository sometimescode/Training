class MyFirstJavaProgram {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        displayResult(num1, num2);
    }

    public static void displayResult(int num1, int num2){
        int num3;
        
        num3 = MathOperator.addTwoNumber(num1, num2);
        System.out.println(num3);
    }
}

//put in new Repository
    //UI
    //1. Display Information, 2. Add Funds, 
    //3. Withdraw Funds, 4. Convert Funds

    //Intro
    //Ask user to input name. Then set Initial Funds to 10k
    //and initial currency to PHP

    //After that
    //Continuosly ask for options or actions from the user
    //four options are: in UI. Fifth option 0: display information and
    //stops loop

    //[1] Name, Current Funds, Current Currency Used
    //Funds must reflect the given currency used and converted amt

    //[2] Ask for amount of funds to be added. Conditions present
    
    //[3] Like 2. Conditions present as well.

    //[4] Convert current amount to the selected currency.
    // choose to add 2 more currencies to convert to (aside from PHP)
    //program will ask the user to select new currency