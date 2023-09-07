package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C10_FizzBuzz {
    public static void main(String[] args) {
        //Fizz Buzz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz.");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) { // en dar kapsamlı olanı en üste yazman lazım
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

        }
    }
}
