package BMIAdvisor;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
   
    Scanner okuyucu = new Scanner(System.in);

    System.out.print("Kullanici Adi: ");
    String ad = okuyucu.nextLine();

    System.out.print("Agirligi: ");
    double agirlik = okuyucu.nextDouble();

    System.out.print("Boyu (Ornegin 1.65): ");
    double boy = okuyucu.nextDouble();

    double vki = agirlik / (boy * boy);

    System.out.println("Kullanici Adi: " + ad);
    System.out.println("Hesaplanan VKİ Değeri: " + vki);
    
    if(vki < 18.5){
        System.out.println("Durumu: Zayif");
    }
    else if(vki >= 18.5 && vki < 25){
        System.out.println("Durumu: İdeal Kilo");
    }
    else if(vki >= 25 && vki < 30){
        System.out.println("Durumu: Fazla Kilolu");
    }
    else{
        System.out.println("Durumu: Kilolu");
    }

    okuyucu.close();

    }
}