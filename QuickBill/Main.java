package QuickBill;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){

   Scanner okuyucu = new Scanner(System.in);
   
   System.out.print("Urun Adi: ");
   String urunadi = okuyucu.nextLine();

   System.out.print("Urun Adedi: ");
   int adet = okuyucu.nextInt();
   
   double birimfiyat = 45.5;
   System.out.println("Birim Fiyat: " + birimfiyat);

   double toplamtutar = birimfiyat * adet;
   String currency = "TL";

   System.out.println("Urun Adi: " + urunadi);
   System.out.println("Toplam Tutar: " + toplamtutar + " " + currency);

   okuyucu.close();
   
   }
}