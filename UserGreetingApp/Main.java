package UserGreetingApp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = o.next();

        System.out.print("Enter your surname: ");
        String surname = o.next();

        if(name.isEmpty() && surname.isEmpty()) {
            System.out.println("Enter your name & surname again.");
        }
        else if(name.equals(name) && surname.equals(surname)) {
            System.out.println("Welcome to Java, " + name + " " + surname + "!");
        }
        else
            System.out.println("Try again.");

        o.close();

    }
}
