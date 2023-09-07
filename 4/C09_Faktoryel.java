package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C09_Faktoryel {
    public static void main(String[] args) {
        // kullanıcıdan 20'den kucuk bir sayi alip
        //bu sayinin faktoryel degerini hesaplayin.
        // 6! = 6*5*4*3*2*1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen faktoryelini almak istediğiniz bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int faktoryel= 1;
        for (int i = 1; i <= sayi;i++ ){
            faktoryel *= i;
        }
        System.out.println("Faktoryel degerimiz : "+ faktoryel);



    }
}
