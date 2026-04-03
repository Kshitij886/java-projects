import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print out to console
        System.out.println("Hello world");
        System.out.println("I like pizza, Buy me a pizza");
        // Variables
        // there are two types of variables primitive and non-primitive
        // primitives are those variables which value store on stack (this contains less storage but fast) Eg: int, char, boolean, double
        // non-primitives are those variables which value store on heap (large storage but slower than stack) Eg: string, array, objects
        // creating a variables
        int a = 30;
        System.out.println("var is " + a);

        double pi = 3.14;

        char grade = 'A';
        char symbol = '!';

        boolean isStudent = true;
        boolean isForSale = false;

        // strings
         String name  = "Kshitij khatri";
         System.out.print("Hello "+ name);

         // taking input from console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String myName = scanner.nextLine();
        System.out.println("Hello "+myName);

        scanner.close();

    }
}