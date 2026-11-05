package NestedLoopPattern;

public class Main {
    public static void main(String[] args) {

        for(int satir = 1; satir <= 4; satir++){

            for(int sayi = 1; sayi <= satir; sayi++) {
                System.out.print(sayi + " ");
            }

            System.out.println();
        }

    }

}
