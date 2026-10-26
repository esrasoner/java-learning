package PrintfFormattingDemo;

public class Main {
    public static void main(String[] args) {  

        String isim = "Sungerbob";
        char ilkharf = 'S';
        int yas = 30;
        boolean issizMi = false;

        System.out.printf("Selam %s.\n", isim);
        System.out.printf("Ismin %c ile basliyor.\n", ilkharf);
        System.out.printf("%d yasindasin.\n", yas); 
        // %i diye bir sey yok, int ici %d kullanilir. (%d = decimal)
        System.out.printf("Issizlik durumun: %b", issizMi);

    }
}
