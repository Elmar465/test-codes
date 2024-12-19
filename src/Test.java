import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Car car =  new Car();
//        car.accelarate();
//        car.stop();
//
//        System.out.println("Welcome to calculator ");
//        display();
//
//    }
//
//    public static void display(){
//        boolean display =  true;
//        while (display){
//            sum();
//        }
//    }
//    public static void sum(){
//       Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter firs number: ");
//        int sum1 =  scanner.nextInt();
//        System.out.print("Enter second number:");
//        int sum2 =  scanner.nextInt();
//        int result = sum1 + sum2;
//        System.out.println("Sum of these numbers " + result);
//
//    }
        mult(0,0);
    }

    public static Integer mult(Integer a, Integer b){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the first number");
        a =  scanner.nextInt();
        System.out.println("Enter the second number");
        b = scanner.nextInt();
        int result  = a * b;
        System.out.println("The result is " + result );
        return result;
    }
}
