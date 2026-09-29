package CinemaTicketCalc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);

        int toplamFiyat = 0;

        System.out.print("Bilet türü (normal / 3d): ");
        String biletTuru = okuyucu.nextLine();

        System.out.print("Patlamis misir ister misiniz? (true/false): ");
        boolean misirVarMi = okuyucu.nextBoolean();

        System.out.print("Öğrenci misiniz? (true/false): ");
        boolean ogrenciMi = okuyucu.nextBoolean();

        if (biletTuru.equals("normal")) {
            toplamFiyat += 120;
        } else if (biletTuru.equals("3d")) {
            toplamFiyat += 180;
        }

        if (misirVarMi) {
            toplamFiyat += 50;
        }

        if (ogrenciMi) {
            toplamFiyat -= 20;
        }

        System.out.println("Toplam bilet tutariniz: " + toplamFiyat + " TL");

        okuyucu.close();
    }
}