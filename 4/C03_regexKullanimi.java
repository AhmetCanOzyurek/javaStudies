package day04__Stringmanupilation_ForLoops;

public class C03_regexKullanimi {
    public static void main(String[] args) {
        String str = "J1av4a Guz3el09dir";
        //metindeki sayilari temizleyin.

        System.out.println(str.replaceAll("\\d",""));
        // java guzeldir

        //sayiların gorunmemesi icin sayilar yerine yıldız koyun.
        System.out.println(str.replaceAll("\\d","*")); //d kucuk  dahil
        //J*av*a Guz*el**dir.

        //sayi olmayan tüm karakterleri silin.
        System.out.println(str.replaceAll("\\D","")); //D buyuk harf hariç

        str = "J12%a4&6.v_334&a";

        //harfler harici hepsini temizleyin.
        str = str.replaceAll("\\d","");
        str = str.replaceAll("\\W","");
        str= str.replace("_","");
        System.out.println(str);


    }
}
