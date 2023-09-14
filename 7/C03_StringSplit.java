package day07_ArrayiListeyeCevirme;

import java.util.Arrays;

public class C03_StringSplit {
    public static void main(String[] args) {

        String str = "JAva ogrenmek cok guzel, keyifli bir programlama dili.";
        str.split("guzel");
        System.out.println(Arrays.toString(str.split("guzel")));
        //[JAva ogrenmek cok , , keyifli bir programlama dili.]

        System.out.println(Arrays.toString(str.split("e")));

        //bu cumlede kac kelime var?

        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println("cumledeki kelime sayisi: "+str.split(" ").length );

        String sonuc = "1-48 of over 4,000 results for 'java'";
        //arama sonuclarının 100'in uzerinde oldugunu  test edin.

        String[] sonucArr=sonuc.split(" ");
        System.out.println(Arrays.toString(sonucArr));

        String javaSonucSayisiStr = sonucArr[3];
        System.out.println(javaSonucSayisiStr);

        javaSonucSayisiStr = javaSonucSayisiStr.replaceAll("\\D","");
        System.out.println(javaSonucSayisiStr);
        int javaSonucSayisi= Integer.parseInt(javaSonucSayisiStr);

        if(javaSonucSayisi>1000){
            System.out.println("Java arama sonucu 1000'den fazla, test PASSED");
        }
    }
}
