package day06_scope_arrays;

import java.util.Arrays;

public class C13_ArrayaElementEkleme {
    public static void main(String[] args) {
        //soru7- verilen bir array'a istenen bir elemani ekleyip bize donduren bir method yazin
        //  eskki array'e yeni degeri atayin.
        int[] arr  = {3,6,8};

        int[]  yeniArr = {3,6,8,10};

        arr = yeniArr;
        System.out.println("arr'in son hali: " + Arrays.toString(arr));

        /*

        varolan bir array'a lenght'İnden daha fazla veya daha az eleman atayamazsınız

        ama var olan bir ARRaya'e baska yeni bir array deger olarak atanabilir.
        bu durumda eski array'in length'i yeni atanan array'in length'i olur.

         */

        String[] isimler = {"Ali","Veli","Ayse"};
        //isimler array'ine Fatma'yi ekleyelim.
        String eklenecekIsim = "Fatma";
        String[] yeniIsimArr= new String[isimler.length+1];
        System.out.println(Arrays.toString(yeniIsimArr));//


        for (int i = 0; i < isimler.length; i++) {
            yeniIsimArr[i] = isimler[i];
        }
        System.out.println(Arrays.toString(yeniIsimArr));

        yeniIsimArr[yeniIsimArr.length-1] = eklenecekIsim;
        System.out.println(Arrays.toString(yeniIsimArr));

        isimler = yeniIsimArr;

        System.out.println(Arrays.toString(isimler)); // isimler array'ini son hali.
        
    }
}
