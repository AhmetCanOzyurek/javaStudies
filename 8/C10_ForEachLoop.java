package day08_ArrayLists_foreachLoop;

import java.util.List;
import java.sql.Array;
import java.util.ArrayList;

public class C10_ForEachLoop {
    public static void main(String[] args) {
        /*
        srou 3- Verilen String bir array'deki her bir elementi kontrol edip,
                - kelimenin uzunlugu cift sayi ise ilk yarisini
                - kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                 yeni bir listeye ekleyip yazdirin.
         */


        List<String> isimler = new ArrayList<>();
        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Cem");
        isimler.add("Gamze");
        List<String > yeniList = new ArrayList<>();
        int kelimeUzunlugu = 0;
        for (String each:isimler
             ) {
            kelimeUzunlugu = each.length();
            if (kelimeUzunlugu % 2 ==0){
                //- kelimenin uzunlugu cift sayi ise ilk yarisini
                yeniList.add(each.substring(0,kelimeUzunlugu/2));
            }else{
                //- kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                yeniList.add(each.substring(kelimeUzunlugu/2));
            }
        }
        System.out.println("yeni liste : " + yeniList);
    }
}
