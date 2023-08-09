package day01_programlamayagiris;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        kullanıcıdan ismini alıp büyük harfle yazdıralım.
         */
        //1-scanner objesi oluştur.
        Scanner scanner = new Scanner(System.in);

        //2-scanner objesi oluştur.
        System.out.println("Lutfen isminizi giriniz");
        //3-girilen veriyi kaydedebileceğimiz bir variable oluşturup scanner objesi ile uygun method kullanip değeri alalım.
        String kullanıcıİsmi = scanner.nextLine();

        System.out.println(kullanıcıİsmi.toUpperCase());
    }
}
