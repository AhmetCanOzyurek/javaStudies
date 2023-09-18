package day08_ArrayLists_foreachLoop;


import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class C05_REmove {
    public static void main(String[] args) {
        List<String > harfler= new ArrayList<>();
        harfler.add("K");
        harfler.add("A");
        harfler.add("L");
        harfler.add("A");
        harfler.add("K");

        System.out.println(harfler);

        harfler.remove("m");

        harfler.remove("K");
        System.out.println(harfler);

        harfler.remove(0);
        System.out.println(harfler);



        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(6);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(1);
        System.out.println(sayilar);//[6, 4, 3, 2, 1]
        // eger listemiz sayilardan olusuyorsa
        // objeler de Integer, index'ler de intgere oldugundan
        // Java sayi yazdigimizda direk INdex kabul eder.
        sayilar.remove(1);
        System.out.println(sayilar);//[6, 3, 2, 1]

        /*
        NON-PRiMİTİVE varların genel adı objedir.
         */

        //eger elemenet olan (obje olan) 1'i silmek istiyorsak
        // önce bir obje olusturmamız lazım.
        Integer silinecekSayi =1;
        System.out.println(sayilar.remove(silinecekSayi));
        System.out.println(sayilar);

    }
}
