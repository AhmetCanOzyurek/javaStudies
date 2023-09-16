package day07_ArrayiListeyeCevirme;

import java.util.ArrayList;
import java.util.List;

public class C11_Remove {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();

        isimler.add("cem");
        isimler.add("arda");
        isimler.add("Eyup");
        isimler.add("Ahmet");

        System.out.println(isimler);

        System.out.println(isimler.remove("Eyup"));
        System.out.println(isimler);

        //en bastaki ismi silelim
        System.out.println(isimler.remove(0));
        System.out.println(isimler);

        System.out.println(isimler.remove("mehmet"));// false


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(6);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(3);

        /*
        liste sayilardan olusuyorsa
        remove() argument  olarak yazdigimiz sayiyi INDEX kabul eder.
        eger obje olarak 1'i silmek isterseniz
        once 1'i obje olarak olusturmalisiniz
         */
        Integer silinecekSayi = 1;
        System.out.println(sayilar.remove(silinecekSayi)); // true
        System.out.println(sayilar); // [6,5,2,3];



    }
}
