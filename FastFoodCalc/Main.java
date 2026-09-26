package FastFoodCalc;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
 
        Scanner okuyucu = new Scanner(System.in);
         
        System.out.print("Menu Adi: ");
        String ad = okuyucu.nextLine();

        System.out.print("Menu Fiyati: ");
        double fiyat = okuyucu.nextDouble();

        System.out.print("Menu Adedi: ");
        int adet = okuyucu.nextInt();

        double toplam = fiyat * adet;
        double indirimlitoplam = fiyat * adet - 30;
        
        System.out.println("Menu Adi: " + ad);
        System.out.println("Menu Fiyati: " + fiyat);
        System.out.println("Menu Adedi: " + adet);
    
        if(toplam >= 200){
            System.out.print("30 TL indirim kazandiniz! Odenecek Tutar: " + indirimlitoplam);
        }
        else{
            System.out.print("Odenecek Tutar: " + toplam);
        }
       
        okuyucu.close();
            
    }

}
