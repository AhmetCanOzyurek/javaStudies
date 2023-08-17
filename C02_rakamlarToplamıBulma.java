package day02_operatorler;

import java.util.Scanner;

public class C02_rakamlarToplamıBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir sayı giriniz: ");
        int sayi =scanner.nextInt();
        int birlerBasamagı= 0, rakamlarToplamı=0;

/*
            birlerBasamagı = sayi % 10;
            rakamlarToplamı += birlerBasamagı;
            sayi = sayi / 10;

            birlerBasamagı = sayi % 10;
            rakamlarToplamı += birlerBasamagı;
            sayi = sayi / 10;

             birlerBasamagı = sayi % 10;
            rakamlarToplamı += birlerBasamagı;
            sayi = sayi / 10;

            */
        for (int i = 0; i <=4;i++) {
            birlerBasamagı = sayi % 10;
            rakamlarToplamı += birlerBasamagı;
            sayi = sayi / 10;
        }
        System.out.println(rakamlarToplamı);

    }
}
