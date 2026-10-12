package LastDigitSum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Ilk tam sayiniz: ");
        int ilk = okuyucu.nextInt();

        System.out.print("Ikinci tam sayiniz: ");
        int ikinci = okuyucu.nextInt();

        int ilksonbas = ilk % 10;
        int ikincisonbas = ikinci % 10;

        System.out.println("Son basamaklarin toplami: " + (ilksonbas + ikincisonbas));

        okuyucu.close();
    }
}
