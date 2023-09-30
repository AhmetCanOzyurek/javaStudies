package day10_passByValue_Immutable_dateTime;

import java.util.Arrays;

public class C04_PassByValue {
    /*
    Java PassByValue kullanir

    PassByValue method'lar arasi geciste, gonderilen variable'in
    kendisini degil degerini gondermek demektir.

    Gonderdeigimiz parametre tek bir element iceren
    int, double, String gibi bir variable ise
    Method'da yapilan degisiklikler method'da kalir.

    Gonderdigimiz paramtere array veya list gibi
    birden fazla element iceriyorsa
    method'da yapilan degisiklikliginne oldugu ONEMLİDİR
    -Eger array veya list'in sadece elementlerine yeni degerler ataniyor ise
    main methoda donuldugunde eleman degisikliklerini KORUR.
    -Eger method'da array veya list'in kendisine yeni bir array veya list degeri atanirsa
    main method'a donuldugunde array veya list'e atanan yeni deger kabul edilmez
    main method'daki ilk deger gecerli olur.
     */
    public static void main(String[] args) {
        int[] sayilar  = { 3,6,7};
        System.out.println("main method'da array'in ilk hali: " + Arrays.toString(sayilar));
        System.out.println("Method'dan sonuc olarak donen array: "+ Arrays.toString(sayilariArtir(sayilar)));
        System.out.println("method call'dan sonra array'in son hali: "+ Arrays.toString(sayilar));
    }

    public static int[] sayilariArtir(int[] sayilar){
        //bu method icinde 3 tane 10 sayisi olan yeni bir array olusturup sayılar arrayine bu yeni array'i atıyor

        //sayilar : {3,6,7}

        int[] yeniArray = {10,10,10};
        sayilar = yeniArray;
        System.out.println("method icindeki array'in so hali : " + Arrays.toString(sayilar));
        return sayilar;
    }
}
