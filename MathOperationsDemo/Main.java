package MathOperationsDemo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);

        double sonuc, sonuc1, sonuc2, sonuc3, sonuc4, sonuc5, sonuc6, sonuc7;

        sonuc = Math.pow(2,5);
        sonuc1 = Math.abs(-242);
        sonuc2 = Math.sqrt(81);
        sonuc3 = Math.round(114.6);
        sonuc4 = Math.ceil(5.2);
        sonuc5 = Math.floor(3.98);
        sonuc6 = Math.max(5,10);
        sonuc7 = Math.min(1,10);

        System.out.println("Math.pow(2,5): " + sonuc);
        System.out.println("Math.abs(-242): " + sonuc1);
        System.out.println("Math.sqrt(81): " + sonuc2);
        System.out.println("Math.round(114.6): " + sonuc3);
        System.out.println("Math.ceil(5.2): " + sonuc4);
        System.out.println("Math.floor(3.98): " + sonuc5);
        System.out.println("Math.max(5,10): " + sonuc6);
        System.out.println("Math.min(1,10): " + sonuc7);


    }
    
}
