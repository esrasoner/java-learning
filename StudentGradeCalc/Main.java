package StudentGradeCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     
    Scanner okuyucu = new Scanner(System.in);
     
    System.out.print("Ogrenci Adi: ");
    String ad = okuyucu.nextLine();
     
    System.out.print("Vize Notu: ");
    double vizenotu = okuyucu.nextDouble();

    System.out.print("Final Notu: ");
    double finalnotu = okuyucu.nextDouble();

    double ort = (vizenotu * 0.40) + (finalnotu * 0.60);

    System.out.println("Ogrenci Adi: " + ad);
    System.out.println("Hesaplanan Ortalama: " + ort);

    if(ort >= 50){
    System.out.print("Ders Durumu: Gecti");
    }
    else{
    System.out.print("Ders Durumu: Kaldi");
    } 

    okuyucu.close();

    }
}
