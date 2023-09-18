package day08_ArrayLists_foreachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_İstenmeyenElementleriSilme {
    public static void main(String[] args) {
        int[] arr = {2,25,89,56,65,48,12,4,5,5,6,7,4,5,7,8,5,6,78};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        for (int i = 0; i <sayilar.size() ; i++) {
            if(sayilar.get(i) % 2 == 0){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);

        //listeden her element sildigimizde, indexler bir degisecegi icin
        // bazi elementler, kontrol edilmeden gecilebilir.,

        /*
        listeden direk silmek yerine once
        SILINMEYECEK elementleri bir baska listeye kaydedip
        loop bittikten sonra, ikinci listeyi, asil liste olarak kaydedebiliriz.
         */

        List<Integer> geciciList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if(sayilar.get(i) % 2 != 0){
                geciciList.add(sayilar.get(i));
            }
        }

        sayilar = geciciList;
        System.out.println(sayilar);
      // silerek dogru yola ulasamayız, ekleme yaptıgımız icin dogru sonuca ulastık

    }
}
