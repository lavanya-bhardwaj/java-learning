package RandomNumbers;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random random = new Random();

        double number1;
        int number2;
        int number3;

        boolean isHeads;

        isHeads = random.nextBoolean();
        number1 = random.nextDouble(0, 1);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);
        System.out.println(isHeads);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(isHeads){
            System.out.println("Heads");

        }
        else{
            System.out.println("Tails");
        }
    }
}
