package day01_programlamayagiris;

import java.util.Scanner;

public class c012_CharDataTuru_AsciiTable {
    public static void main(String[] args) {
        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = '5';
        System.out.println(chr1); //a


        char chr4 = 'f';
        System.out.println((char)(chr4 -32)); // küçük karakterlerle büyük karakterler arasında 32 ascii değeri var.




        System.out.println(chr1 + chr2); // 195
        System.out.println(chr1 + chr3); // 150
        //kullanıcıdan bir karakter alıin
        // ascii tablosunda  ondan sonraki 3 karakteri yazdır.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen ascii tablosundan bir karakter giriniz");
        char girilenKarakter = scanner.next().charAt(0); // Kullanıcı ali can girdiğinde ilk indisindeki karakteri alır. dizinin ilk elemanı.
        System.out.println("Girdiğiniz karakter: " + girilenKarakter);
        System.out.println("Girdiğiniz karakterden 1 sonraki karakter: " + (char)(girilenKarakter+1));
        System.out.println("Girdiğiniz karakterden 2 sonraki karakter: " + (char)(girilenKarakter+2));
        System.out.println("Girdiğiniz karakterden 3 sonraki karakter: " + (char)(girilenKarakter+3)); // java karakterlerin ascii degerleri ile ilgilenir.






    }
}
