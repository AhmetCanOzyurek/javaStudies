package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C11_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir tamsayi alin
        //rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        //oncelikle basamak sayisini bulalim

        int basamakSayisi = (sayi + "").length();
        int birlerBasamagi= 0;
        int rakamlarToplami = 0;
        int geciciSayi= sayi;

        for (int i = 0; i <= basamakSayisi ; i++) {
            birlerBasamagi= geciciSayi % 10;
            rakamlarToplami += birlerBasamagi;
            geciciSayi /=10;
        }
        System.out.println("Rakamlar toplamı: " + rakamlarToplami);
    }
}
