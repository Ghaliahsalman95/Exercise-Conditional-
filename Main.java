import java.nio.file.LinkPermission;
import java.text.DecimalFormat;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//---------------------------------------Exercise 1------------------------------------
        System.out.println("---------------------------------------Exercise 1----------------------------------");

        System.out.println("Please Enter the  role Admin , Super user, or User");
        String role= input.nextLine().toLowerCase();
        role=role.replace(" ","");
        if(role.equals("admin"))
            System.out.println("Welcome Admin");
        else if(role.equals("superuser"))
            System.out.println("Welcome Super user");
        else if (role.equals("user"))
            System.out.println("Welcome User");
        else
            System.out.println("You don't write correct word");

///////////////////////////////////////////////////////////////////////////////////////////

//---------------------------------------Exercise 2------------------------------------

/*2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87 */
        System.out.println("---------------------------------------Exercise 2----------------------------------");

        System.out.println("Please write 3 number to print the great one");
        System.out.println("Please write 1 number");
        int num =input.nextInt();
        System.out.println("Please write 2 number");
        int num2 =input.nextInt();
        System.out.println("Please write 3 number");
        int num3 =input.nextInt();
        if(num>num2&&num>num3)
        System.out.println("The greatest is "+num);
        else if (num2>num3&&num3>num)
            System.out.println("The greatest is "+num2);
        else System.out.println("The greatest is "+num3);






///////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------Exercise 3------------------------------------

        /*3.Write a Java program that generates an integer between 1 and 7 and
displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday */
        System.out.println("---------------------------------------Exercise 3----------------------------------");

        int number = (int) (Math.random() * 6) + 1;
        System.out.println("The number  generated is  " + number);
        switch (number) {
            case 1:
                System.out.println("Day is Sunday");
                break;
            case 2:
                System.out.println("Day is Monday");
                break;
            case 3:
                System.out.println("Day is Tuesday");
                break;
            case 4:
                System.out.println("Day is Wednesday");
                break;
            case 5:
                System.out.println("Day is Thursday");
                break;
            case 6:
                System.out.println("Day is Friday");
                break;
            case 7:
                System.out.println("Day is Saturday");
                break;

            default:
                System.out.println("Sorry generated wrong");


        }


///////////////////////////////////////////////////////////////////////////////////////////

//---------------------------------------Exercise 4------------------------------------
/*4. Write a program that takes a numeric score as input and prints the
corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B */
        System.out.println("---------------------------------------Exercise 4----------------------------------");

       char grade;
        System.out.println("Enter your numeric score: ");
        int marks=input.nextInt();
       // DecimalFormat decimalFormat3 = new DecimalFormat("#.##");
       // marks=Float.valueOf(decimalFormat3.format(marks));
        if (marks >= 90 && marks<=100)
          grade = 'A';
        else if (marks >= 80 && marks<=90 )
          grade = 'B';
      else if (marks >= 70 && marks<=80 )
          grade = 'C';
       else if (marks >= 50 && marks <= 60 )
          grade = 'D';
       else
          grade = 'F';
       System.out.println("Numeric Score: " + marks);
       System.out.println("Letter Grade:  " + grade);


///////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------Exercise 5------------------------------------
/*5. Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
"Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult*/
        System.out.println("---------------------------------------Exercise 5----------------------------------");

        System.out.println("Enter your age");
        int age = input.nextInt();
        if (age <= 13)
            System.out.println("You are a child");
        else if (age>13 && age <= 19)
            System.out.println("You are a Teenager");
        else
            System.out.println("You are an Adult");





    }

///////////////////////////////////////////////////////////////////////////////////////////




    }

