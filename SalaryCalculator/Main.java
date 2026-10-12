package SalaryCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner okuyucu = new Scanner(System.in);

    System.out.print("Calisanin Adi: ");
    String ad = okuyucu.nextLine();

    System.out.print("Mevcut Maasi: ");
    double maas = okuyucu.nextDouble();

    System.out.print("Bu ay tamamladigi proje sayisi: ");
    int projesayisi = okuyucu.nextInt();

    double primtutari = projesayisi * 500;
    maas += primtutari;
    double ikramiye = maas / 5;
    maas += ikramiye;
    double kalanbozukpara = maas % 100;
    int kidemYili = 2;
    kidemYili++;

    System.out.println("Calisan adi: " + ad);
    System.out.println("Toplam maas: " + maas);
    System.out.println("Kalan bozuk para: " + kalanbozukpara);
    System.out.println("Yeni kidem yili: " + kidemYili);

    okuyucu.close();

    }
}
