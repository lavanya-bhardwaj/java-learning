package variables;

public class Main {
    public static void main(String[] args){

        int age = 19;
        int year = 2026;
        int quantity = 1;

        double CGPA = 9.68;
        double temperature = 45.5;
        double price = 1200000.00;

        char grade = 'O';
        char symbol = '!';
        char currency = '₹';

        boolean isStudent = true;  //camelCase naming convention
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Lavanya Bhardwaj";
        String food = "chocolate";
        String email = "fake123@gmail.com";
        String color = "red";
        String car = "BMW";

        System.out.println("Hello " + name);
        System.out.println("You love " + food);
        System.out.println("Your fav colour is "+color);

        System.out.println("You are " + age + "years old");
        System.out.println("Your CGPA is " + CGPA);
        System.out.println("Your avg letter grade is " + grade);

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);
        if(forSale){
            System.out.println("There is a " + car + " " + "is for sale! YAY!");

        }
        else{
            System.out.println("There is a " + car + " " + "is not for sale... womp womp");
        }



    }
}
