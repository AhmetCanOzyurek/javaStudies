package day07_ArrayiListeyeCevirme;

import java.util.ArrayList;
import java.util.List;

public class C10_SetMetodu {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(0);
        sayilar.add(20);
        sayilar.add(15);
        sayilar.add(12);

        sayilar.add(0,0);
        //add varolan elementleri korur, yeni eklenen element siralamayi degistirirse
        // diger elementleri bir yana kaydirir.

        System.out.println(sayilar);
        //listenin basına element olarak 5 ekleyin

        sayilar.set(0,5);
        //set varolan bir elementi update etmek icin kullanilir, eski degeri siler yeni degeri atar.
        System.out.println(sayilar);
    }
}
