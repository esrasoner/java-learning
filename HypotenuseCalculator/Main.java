package HypotenuseCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter the length of side A: ");
        a = o.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = o.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (Side C) is: " + c);

        o.close();

    }


}
