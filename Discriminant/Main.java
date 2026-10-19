package Discriminant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);

        int a,b,c;
        double delta,r1,r2;

        System.out.print("a sayisi giriniz: ");
        a = o.nextInt();

        System.out.print("b sayisi giriniz: ");
        b = o.nextInt();

        System.out.print("c sayisi giriniz: ");
        c = o.nextInt();
        
        delta = Math.pow(b, 2) - (4 * a * c);
        
        if(delta>0){
            r1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
            r2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("Iki reel kok vardir. " + "R1: " + r1 + "R2: " + r2);
        }
        else if(delta == 0){
            r1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
            System.out.println("Bir kok vardir. " + "R1: " + r1);
        }
        else
            System.out.println("Kok yoktur.");


        o.close();
    }
}
