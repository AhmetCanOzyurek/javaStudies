package day08_ArrayLists_foreachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_Arraylist {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(4);
        sayilar.add(6);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(3);
        sayilar.add(1);

        sayilar.add(0,10);

        System.out.println(sayilar); // başına on ekledik, siz bir kaykılın
        // set() methodu update eder, ekleme yapmaz

        sayilar.set(0,1);
        System.out.println(sayilar); // 0. indexteki 10'u 1'e cevirdik


    }
}
