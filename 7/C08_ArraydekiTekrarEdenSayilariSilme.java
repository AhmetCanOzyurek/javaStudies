package day07_ArrayiListeyeCevirme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ArraydekiTekrarEdenSayilariSilme {
    public static void main(String[] args) {
        int[] arr = {3,2,6,7,3,5,2,9,0};

        //tekrar eden elementleri silip
        // array'i unique elementlerden olusan bir hale getirin.

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar); // []

        sayilar.add(23);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(3);
        System.out.println(sayilar);



        //listedeki 5'in olup olmadigini kontrol edelim.

        System.out.println(sayilar.contains(5));//true

        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }
        System.out.println("unique list : " + uniqueList);
        System.out.println(Arrays.toString(arr));

        arr = new int[uniqueList.size()]; // burada önceki arrayin degerlerini degistirip yeni bir array degeri atadik.
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {
            arr[i]  = uniqueList.get(i);
        }
        //arr 'nin son hali
        System.out.println(Arrays.toString(arr));
    }
}
