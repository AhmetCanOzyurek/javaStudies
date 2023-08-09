package day01_programlamayagiris;

import java.util.Scanner;

public class C06_SWap {
    public static void main(String[] args) {
        // soru 7 Kullanıcıdan iki sayi alıp ikisinin değerlerini değiştirin.
        int sayi1, sayi2 = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Lutfen birinci degeri giriniz: ");
         sayi1 = scanner.nextInt();

        System.out.println("Lutfen ikinci değeri giriniz: ");
         sayi2 = scanner.nextInt();

        System.out.println("Sayi 1: " + sayi1);
        System.out.println("Sayi 2: "+ sayi2);
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("Sayi 1:"+ sayi1);
        System.out.println("Sayi 2: "+ sayi2);
    }
}
