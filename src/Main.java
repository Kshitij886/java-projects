import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.ifStatement();
        main.loops();
        // Print out to console

//        System.out.println("Hello world");
//        System.out.println("I like pizza, Buy me a pizza");
        // Variables
        // there are two types of variables primitive and non-primitive
        // primitives are those variables which value store on stack (this contains less storage but fast) Eg: int, char, boolean, double
        // non-primitives are those variables which value store on heap (large storage but slower than stack) Eg: string, array, objects
        // creating a variables
//        int a = 30;
//        System.out.println("var is " + a);
//
//        double pi = 3.14;
//
//        char grade = 'A';
//        char symbol = '!';
//
//        boolean isStudent = true;
//        boolean isForSale = false;
//
//        // strings
//         String name  = "Kshitij khatri";
//         System.out.print("Hello "+ name);
//
//         // taking input from console
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String myName = scanner.nextLine();
//        // input of int
//
//        System.out.println("Enter your age : ");
//        int age = scanner.nextInt();
//        System.out.println("Age is " + age);
//        System.out.println("Hello "+myName);
//        // for duble next.double for bool nextBoolean()
//        // to remove input buffer we can just call newLine method and dont assign to anything. it happens when we take integer as an input then string
//
//        // area of rec
//
//        double width = 0;
//        double height = 0;
//        double area = 0;
//        System.out.println("Enter Width: ");
//        width = scanner.nextDouble();
//
//        System.out.println("Enter height: ");
//        height = scanner.nextDouble();
//
//        area = width * height;
//
//        System.out.println("Area of rec is : " + area);
//        scanner.close();
//
//

    }
    public  void ifStatement() {
        Scanner scanner = new Scanner(System.in);
        // if statement
        System.out.println("Enter the age : ");
        int age = scanner.nextInt();
        if (age > 18 ){
            System.out.println("You are an adult");
        }else {
            System.out.println("You are an child");
        }
        scanner.close();
    }
    public void loops() {
        for (int i = 0; i <= 5; i++){
            System.out.println("i is " + i);
        }
    }
}