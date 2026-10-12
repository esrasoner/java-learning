package AtmCashDispenser;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Cekmek istediginiz toplam tutar: ");
        int cekilmekistenen = okuyucu.nextInt();

        int ikiyuzluksayisi = cekilmekistenen / 200;
        int ikiykalan = cekilmekistenen % 200;

        int yuzluk = ikiykalan / 100;
        int yuzkalan = ikiykalan % 100;

        int ellilik = yuzkalan / 50;
        int ellikalan = yuzkalan % 50;

        int yirmilik = ellikalan / 20;
        int yirmikalan = ellikalan % 20;

        int onluk = yirmikalan / 10;
        int onlukalan = yirmikalan % 10;

        System.out.println("200 TL: " + ikiyuzluksayisi);
        System.out.println("100 TL: " + yuzluk);
        System.out.println("50 TL: " + ellilik);
        System.out.println("20 TL : " + yirmilik);
        System.out.println("10 TL: " + onluk);
        System.out.println("Kalan Bozuk Para: " + onlukalan + " TL");

        okuyucu.close();
    }
}
