package RandomNumberGenerator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        int number1, number2, number3;
        boolean isRandom;

        number1 = r.nextInt(1, 7);
        number2 = r.nextInt(1,7);
        number3 = r.nextInt(1,7);
        isRandom = r.nextBoolean();

        System.out.println("First random number is " + number1 + ".");
        System.out.println("Second random number is " + number2 + ".");
        System.out.println("Third random number is " + number3 + ".");

        if(isRandom){
            System.out.println("It is random.");
        }
        else
            System.out.println("It's not random.");


    }
}
