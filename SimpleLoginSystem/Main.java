package SimpleLoginSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);

        String ad, soyad;

        System.out.print("Adiniz?: ");
        ad = o.next();

        System.out.print("Soyadiniz?: ");
        soyad = o.next();

        if(ad.equals("Esra") && soyad.equals("Soner")) {
            System.out.println("Basariyla giris yaptiniz.");
        }
        else if (ad.equals("esra") && soyad.equals("soner")) {
            System.out.println("Basariyla giris yaptiniz.");
        }
        else
            System.out.println("Basarisiz girisim.");

        o.close();

    }
}
