import java.math.BigInteger;
import java.util.*;
import java.util.random.RandomGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {

        Student student = new Student("Elmar", "Jafarli", 29, "elmar465@gmail.com");
        System.out.println(student);
        System.out.println(Arrays.toString(numbers));
        List<Integer>  number =  new LinkedList<>();

        int[] number1 =  {1,2,3,4,5};
        System.out.println(Arrays.toString(number1));
 //        Book book = new Book();
//        book.displayDetail();

//        for(int x =1; x <=100; x++){
//            if(x % 5 == 0){
//                System.out.println("Pragra");
//            } else {
//                System.out.println(x);
//            }

//            if(x == 5){
//                System.out.println("Pragra");
//                continue;
//            }
        }

//     int x  = 5;
//        while(x <=10) {
//               System.out.println(x * 1 + (" x " + x + " = " + x));
//               x++;
//        }
//
//        int z =1;
//        while (z <=10) {
//            System.out.println();
//        }
//
       // Scanner scanner =  new Scanner(System.in);

//        System.out.print("Enter number 1 to 100 ");
//        int number = scanner.nextInt();
//
//            while (number <= 100) {
//                System.out.println("You choose number " + number);
//                number++;
//                break;
//            }
//
//            System.out.println("press 1 to cont ");
//          int sum =  scanner.nextInt();
//            while (sum != 0){
//                    System.out.println("Enter first Number");
//                    int sum1 =  scanner.nextInt();
//                    System.out.println("Enter second number");
//                    int sum2 =  scanner.nextInt();
//                    int result =  sum1 + sum2;
//                    System.out.println("Sum of these number is " + result);
//            }

//        int number1 =  5;
//        int z = 1;
//
//
//        do {
//            System.out.println(number1 + " * " + z  + " = " + (number1 * z));
//            z++;
//        } while (z <=10);
//        System.out.print("Enter a number for the multiplication table: ");
//        int number   = scanner.nextInt();
//        int x =  1;
//
//            do {
//                System.out.println(number + "x " + x + " = " + (number * x));
//                x++;
//            } while (x <=10);
//
//            System.out.println("Enter number to sum");
//            int sum = scanner.nextInt();
//            int number2 = 1;
//
//            do {
//                System.out.println("The sum of " + number2 + " and " + sum + " = " + (number2 + sum));
//                number2++;
//            } while (number2 <=10);

//            int  number = scanner.nextInt();
//            int factorial = 1;
//
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//
//        System.out.println("The factorial of " + number + " is: " + factorial);

//    boolean display =  true;
//        while (display) {
//            displayMenu();
//            int choice  =  getUserChoice();
//            processChoice(choice);
//            System.out.println();
//        }


//
//        while(z <=10) {
//            System.out.println(number1 + " * " + z + " = " + (number1 * z));
//            z++;
//        }
//
//
//        System.out.println("Enter number to multp");
//        System.out.print("Enter a number for the multiplication table: ");
//        int number = scanner.nextInt();
//
//        int i = 1; // Starting value
//        while (i <= 10) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//            i++;
//        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        byte  a =  1;
//        char  b = 'a';
//        String name  = "Elmar";
//        Integer  number = 1;
//        Double  number2 = 2.21;
//        boolean isActive = true;
//        float ab =  221;
//        long ac =  21;
//        double ad = 2.2121;
//        BigInteger da =  new BigInteger("23123131231312311");
//        short ae = 21;
//
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(name);
//        System.out.println(number);
//        System.out.println(number2);
//        System.out.println(isActive);
//        System.out.println(ab);
//        System.out.println(ac);
//        System.out.println(ad);
//        System.out.println(da);
//        System.out.println(ae);
//

//        int a = 8;
//        int b = 4;
//        int sum =  a + b;
//        int minus =  a - b;
//        double  divide = a/b;
//        int multp = a * b;
//        int mod =  a % b;
//
//        System.out.println("a: " + a + " \nb: " + b + "\nsum: " + sum + "\nminus: " + minus +
//                 " \ndivide: " + divide + "\nmultp: " + multp + "\nmod: " + mod);


//        int a =  11;
//        a++;
//        System.out.println(a);


//        int b  = 11;
//        ++b;
//        System.out.println(b);

//        double x = 100;
//        int y = 2;
//        double result = x / y;
//
//        if (result != 0) {
//            System.out.println("This is odd number");
//        } else {
//            System.out.println("This is even nubmer");
//        }
//
//        int a = -1;
//
//        String result1 = (a == -1) ? "This is minus number" : "This is plus number";
//        System.out.println(result1);
//
//
//        int number1 =  10;
//        int number2 =  28;
//        int number3 =  15;
//
//
//
//        if(number2 > number1) {
//            System.out.println("Greater number is: " + number2);
//            if(number3 > number2){
//                System.out.println("Greater number is: " + number3);
//            }
//        } else  {
//            System.out.println(?);
//        }
//
//
//        // 10, 28,15;
//        int a1 = 10;
//        int a2 = 28;
//        int a3 = 15;
//        int result2 = 0;
//        if (a1 < a2) {
//            System.out.println("Greater number is " + a2);
//        } else if (a2 < a3) {
//            System.out.println("Greater number is " + a3);
//        } else {
//            System.out.println("error");
//        }


//        int  x  = 23;
//
//        if(x % 2 == 0) {
//            System.out.println( x + " is even");
//        } else {
//            System.out.println( x + " is odd ");
//        }

//        Scanner  scanner =  new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int result  =  scanner.nextInt();
//        System.out.print("Enter the second number: ");
//        int result2 = scanner.nextInt();
//        if(result2 > result) {
//            System.out.println( result2 + " is Greater  than " + result);
//        } else if(result2 < result) {
//            System.out.println( result2 + " is less  than " + result);
//        } else {
//            System.out.println("both numbers are equal");
//        }
//
//        System.out.print("Enter your grades to see your result: ");
//        int checkGrades =  scanner.nextInt();
//        if(checkGrades >= 90){
//            System.out.println("You got A+");
//        } else if( checkGrades >= 80) {
//            System.out.println("You got A");
//        } else if(checkGrades >= 70) {
//            System.out.println("You got B+");
//        } else if (checkGrades >= 60) {
//            System.out.println("You got B");
//        } else if(checkGrades >= 50) {
//            System.out.println("You got C");
//        } else  {
//            System.out.println("You failed");
//        }

//        if(checkGrades <= 100 || checkGrades >= 90) {
//            System.out.println("You got a A+");
//        } else if(checkGrades < 90 || checkGrades >= 80) {
//            System.out.println("You got a A");
//        } else if (checkGrades >= 60 || checkGrades <= 79) {
//            System.out.println("You got a B+");
//        }
//         else if(checkGrades == 60 || checkGrades <= 69)     {
//                    System.out.println("You got a B");
//            }
//         else if ( checkGrades >= 69 || checkGrades <50) {
//                System.out.println("You Got C+");
//        } else if (checkGrades >=50) {
//                System.out.println("You got A C");
//        } else {
//            System.out.println("You failed");
//        }



//    public static void displayMenu(){
//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int number1 =  scanner.nextInt();
//        System.out.println("Enter the second Number ");
//        int number2 =  scanner.nextInt();
//        int result =  number1+  number2;
//        System.out.println("First number is " + number1 + " Second number is  " + number2 + " sum is " + result);
//        System.out.println("Do you want to continue ?");
//        String answer  = scanner.next();
//        if (answer.equals("y") || answer.equals("Y")){
//            displayMenu();
//        }  else  {
//          System.exit(0);
//        }
//    }
//
//    public static int getUserChoice(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the numbers");
//        return scanner.nextInt();
//    }
//
//    public static void processChoice(int choice){
//        switch (choice){
//            case 1:
//                displayMenu();
//                break;
//            case 2:
//                exitApp();
//                break;
//            default:
//                System.out.println("Wrong input");
//        }
//    }
//    public static void exitApp(){
//        System.out.println("Bye");
//        System.exit(0);
//    }

}

