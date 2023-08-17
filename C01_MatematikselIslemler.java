package day02_operatorler;

import java.util.Scanner;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {
        int sayi = 10;
        int sayi2 = 20;
        String str = "Java";

        System.out.println(str + sayi + sayi2); //java1020
        System.out.println(str + (sayi +sayi2)); //tester olarak matematikle pek ilişiğimiz yok.
        //mat işlem önceliği : üsler > parentez içleri > çarpma ve bölme işlemleri > toplama ve çıkarma işlemleri
            //aynı önceliğe sahip işlemlerde önce sol taraf yapılır.

    }
}
