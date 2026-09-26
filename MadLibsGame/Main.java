package MadLibsGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner okuyucu = new Scanner(System.in);
      
        String ad;
        String mekan;
        String sifat;
        String nesne;

        System.out.print("Bir mekan adi girin: ");
        mekan = okuyucu.nextLine();

        System.out.print("Bir isim girin: ");
        ad = okuyucu.nextLine();
        
        System.out.print("Bir sifat girin: ");
        sifat = okuyucu.nextLine(); 

        System.out.print("Bir nesne girin: ");
        nesne = okuyucu.nextLine();

        System.out.println("Geçen gün " + mekan + " civarinda gezerken karsima");
        System.out.println(sifat + " bir kedi cikti.");
        System.out.println("Kedinin adi " + ad + " imis.");
        System.out.println("Agzinda kocaman bir " + nesne + " tutuyordu.");

        okuyucu.close();
    }
}
