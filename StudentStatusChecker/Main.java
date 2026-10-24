package StudentStatusChecker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = o.next();

        System.out.print("Enter your age: ");
        age = o.nextInt();

        System.out.print("Are you a student? (true / false): ");
        isStudent = o.nextBoolean();

        //İSİM
        if(name.isEmpty()) {
            System.out.println("You didn't enter your name.");
        }
        else
            System.out.println("Hello, " + name + "!");

        //YAS
        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }

        //Ogrenci mi?
        if(isStudent) {
            System.out.println("You are a student!");
        }
        else
            System.out.println("You aren't a student!");
        
        o.close();
        }

    }

