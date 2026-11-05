package DoWhileInputLoop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner o = new Scanner(System.in);

        int sayi;

        do {
            System.out.print("Bir sayi girin: ");
            sayi = o.nextInt();
            System.out.println(sayi);

        } while (sayi != 0);

        o.close();
        
    }
}
