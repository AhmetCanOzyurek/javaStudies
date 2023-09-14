package day07_ArrayiListeyeCevirme;

import java.util.Arrays;

public class C02_BinarySearch {
    public static void main(String[] args) {
        //verilen String bir array'de
        // istenen bir String'in var olup olmadigi
        // true veya false olarak bize donduran bir method olusturun.

        String[]arr= {"A","c","T","m"};
        String arananStr="t";
        System.out.println(urunVarMi(arr, "T"));

        /*
        Java'da bu isi yapan hazir bir method vardir
        binarySearch() bir element array'de varsa bulundugu index'i
        element array'de yoksa, olsaydi nerede olacagini soyler.
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "T"));
        System.out.println(Arrays.binarySearch(arr,"A"));
        System.out.println(Arrays.binarySearch(arr,"d"));
        System.out.println(Arrays.binarySearch(arr,"t"));
        System.out.println(Arrays.binarySearch(arr,"m"));
        System.out.println(Arrays.binarySearch(arr,"K"));//


        //ANCAK binarySearch() methodunun duzgun calisabilmesi icin
        // ONCE sort() calistirilmalidir..


        //var olan elementler icin oldugu index
        // olmayanlar icin ise - isareti ile bulunmasi gereken sirayi verir,



    }

    public static boolean urunVarMi (String[]arr,String araranUrun){
        boolean sonuc = false ;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(araranUrun)){
                sonuc =true;
                break;
            }
        }
        return sonuc;
    }
}
