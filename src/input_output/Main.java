package input_output;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your CGPA? ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name + "!");
        System.out.println("You are "+age+ " years old");
        System.out.println("Your CGPA is " + cgpa);

        if(isStudent){
            System.out.println("You are enrolled as a student! hurray?");
        }
        else{
            System.out.println("You are NOT enrolled...");
        }*/


        //COMMON ISSUES
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); //to clear the buffer

        System.out.print("Enter your fav colour: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the colour " + color);

        scanner.close();
    }
}
