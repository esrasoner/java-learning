package Reverse3DigitNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner okuyucu = new Scanner(System.in);

        System.out.print("3 basamakli sayinizi girin: ");
        int sayi = okuyucu.nextInt();

        int birlerbas = sayi % 10;
        int onlarbas = (sayi / 10) % 10;
        int yuzlerbas = sayi / 100;

        System.out.print("Terse cevrilen sayiniz: " + birlerbas + onlarbas + yuzlerbas);
        
        okuyucu.close();
    }
}
