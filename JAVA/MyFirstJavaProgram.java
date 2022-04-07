import java.util.Scanner;

class MyFirstJavaProgram {
    //Arrays, Looping through arrays
    //Array index starts at 0
    public static void main(String[] args){
      // String[] persons = {"John Doe", "Margaret", "Johnny", "Another Person"};

      // String [] personsInit = new String[5];

      // int[] numbers = {1, 2, 3, 4, 5};

      // int count;
      // for(count = 0; count < persons.length; count += 1){
      //   System.out.println(persons[count]);
      // }

      // count = 0;

      // while(count < persons.length){
      //   System.out.println(persons[count]);
      //   count += 1;
      // }

      //Activity 1:
      //array of 5 strings containing names of people
      //instead of putting values directly, store names using scanner
      //display content of array next
      //Activity 2:
      //same with first one.
      //only difference is first one has name
      //this one has name and age so ask for two inputs;

      // arrayActivityOne();
      // arrayActivityTwo();
      //--------------------------------------------------------------------------

      //GIT <- the version control and commands you can use to put things in repository
      //local machine: current pc
      //repository: github

      //from folder you want to push, type git init in cmd
      //git init will create a .git hidden folder in the directory

      //git remote add origin + link of repository     
      //git remote -v = view origin that you set
      //git status to see things
      //git add . (add all) or git add + specific
      //then git commit -m to commit and add a comment to commit
      //git push origin master

      //git clone + link to repository to clone

     //Usual git actions you do.
     //git remote add origin
     //git add .
     //git commit -m ""
     //git push origin + branch name (usually master if default)
     
     //how to make a new branch
     //git checkout -b + name of branch
     //git checkout + name of branch (move between branches)

     //git fetch <- lookup when

     //merging
     //make sure you're on the branch you want merge to occur
     //use git checkout + name of branch to do so
     //git merge master2
     //git commit -m "merged with master2"



    }

    public static void arrayActivityOne(){
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

    public static void arrayActivityTwo(){
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

    public static void personPrinter(int number, String name){
      System.out.println("Person #" + number + ": " + name);
    }
}