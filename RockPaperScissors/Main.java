package RockPaperScissors;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        Random r = new Random();

        int sayi, pc;

        System.out.print("Makas(0),Tas(1),Kagit(2) degerlerinden birini giriniz: ");
        sayi = o.nextInt();

        pc = r.nextInt(3);
        
        switch(sayi) {
            case 0:
                System.out.println("Makas secildi. ");
                if (pc == 0) {
                    System.out.println("Bilgisayar da makasi secti. BERABERE! ");
                }
                else if (pc == 1) {
                    System.out.println("Bilgisayar tasi secti. KAYBETTİN! ");
                }
                else
                    System.out.println("Bilgisayar kagidi secti. KAZANDIN! ");
            break;

            case 1:
                System.out.println("Tas secildi. ");
                if (pc == 0) {
                    System.out.println("Bilgisayar makasi secti. KAZANDIN! ");
                }
                else if (pc == 1) {
                    System.out.println("Bilgisayar da tasi secti. BERABERE! ");
                }
                else
                    System.out.println("Bilgisayar kagidi secti. KAYBETTİN! ");
            break;

                case 2:
                    System.out.println("Kagit secildi.");
                    if (pc == 0) {
                    System.out.println("Bilgisayar makasi secti. KAYBETTİN! ");
                }
                else if (pc == 1) {
                    System.out.println("Bilgisayar tasi secti. KAZANDIN! ");
                }
                else
                    System.out.println("Bilgisayar da kagidi secti. BERABERE! ");
            break;

            default:
                System.out.println("Gecersiz deger.");
            break;

        }

        o.close();

    }
}
