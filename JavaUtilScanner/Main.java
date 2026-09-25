package JavaUtilScanner;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       
       Scanner okuyucu = new Scanner(System.in);
       
       System.out.print("Adinizi yazin: ");
       String name = okuyucu.nextLine();

       System.out.print("Yasinizi yazin: ");
       int age = okuyucu.nextInt();
       
       System.out.print("GANO'nuz kac?: ");
       double gano = okuyucu.nextDouble();

       System.out.print("Ogrenci misiniz? (true/false): ");
       boolean isStudent = okuyucu.nextBoolean();

       System.out.println("Merhaba " + name);
       System.out.println("Siz " + age + " yasindasiniz.");
       System.out.println("Oralamaniz " + gano);

       if(isStudent){
         System.out.println("Ogrencisiniz.");
       }
       else{
         System.out.println("Ogrenci degilsiniz.");
       }
       
       okuyucu.close();
   }
}