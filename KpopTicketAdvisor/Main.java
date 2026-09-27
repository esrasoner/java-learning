package KpopTicketAdvisor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner okuyucu = new Scanner(System.in);
      
      System.out.print("Kullanici Adi: ");
      String ad = okuyucu.nextLine();

      System.out.print("Kullanicinin Yasi: ");
      int yas = okuyucu.nextInt();

      System.out.print("VIP Bilet mi? (true/false): ");
      boolean isVip = okuyucu.nextBoolean();

      double temelfiyat = 1000;
      if (isVip){
        temelfiyat = 2000;
      }

      if(yas < 18){
        double indirimlitutar = temelfiyat * 0.8;
        System.out.print("18 yas alti %20 indirim uygulandi! " + " " + ad + ", odemeniz gereken toplam tutar: " + indirimlitutar + " " + "TL");
      }
      else{
        System.out.print(ad + ", odemeniz gereken tutar: " + temelfiyat + " " + "TL");
      }

      okuyucu.close();

    }
}