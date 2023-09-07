package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C08_ForLoopSoruları {
    public static void main(String[] args) {
        /*
        soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
                sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                bitis degeri baslangic degerinden kucukse, uyarı yazdirip islemi sonlandirin.
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif iki tamsayi giriniz: ");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();
        int toplam = 0;

        if (bitis < baslangic){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz.");
        }else {
            for (int i = baslangic; i <= bitis; i++)
                toplam += i;
            System.out.println("Toplam degerimiz: " + toplam);
        }
    }
}
