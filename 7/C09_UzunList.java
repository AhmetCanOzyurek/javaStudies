package day07_ArrayiListeyeCevirme;

import java.util.ArrayList;
import java.util.List;

public class C09_UzunList {
    public static void main(String[] args) {
        // icinde 2,3,4,5,685,7,34,5354,23,423546,56 elementleri bulunan bir list olusturun


        List<Integer> sayilar = new ArrayList<>();

        int [] geciciArr = {2,3,4,5,6,9,685,7,34,5354,23,423546,56};

        for (int i = 0; i < geciciArr.length ; i++) {
            sayilar.add(geciciArr[i]);
        }
        System.out.println(sayilar);

        System.out.println(sayilar.contains(4));

        System.out.println(sayilar.contains(23));


        List<Integer> arananList = new ArrayList<>();

        arananList.add(3);
        arananList.add(6);
        arananList.add(9);

        System.out.println(sayilar.containsAll(arananList)); // true

        arananList.add(44);
        System.out.println(sayilar.containsAll(arananList));//false
    }
}
