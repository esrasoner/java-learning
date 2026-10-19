package AtmProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);

        double bakiye = 1000;

        System.out.println("--- BANKAMATIK ---");
        
        System.out.println("1-Bakiye Sorgula");
        System.out.println("2-Para Yatir");
        System.out.println("3-Para Cek");
        System.out.println("4-Cikis");

        System.out.print("Islem seciniz: ");
        int secim = o.nextInt();

        switch(secim) {
            case 1:
                System.out.println("Bakiyeniz: " + bakiye);
            break;

            case 2:
                System.out.println("Yatirmak istediginiz miktar: ");
                int yatirilacak = o.nextInt();

                bakiye += yatirilacak;
                System.out.println("Bankanizdaki son miktar: " + bakiye);
            break;

            case 3:
                System.out.println("Cekmek istediginiz miktar: ");
                int cekilecek = o.nextInt();

                if(cekilecek > bakiye) {
                    System.out.println("Yetersiz Bakiye!");
                }
                else{
                    bakiye -= cekilecek;
                    System.out.println("Bankanizdaki son miktar: " + bakiye);
                 }
            break;

            case 4:
                System.out.println("Kartiniz iade edildi.");
            break;

            default:
                System.out.println("Gecersiz islem sectiniz.");
            break;
      
        }

        o.close();

    }
}
