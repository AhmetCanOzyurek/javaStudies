package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C13_TerstenYazdırma {
    public static void main(String[] args) {
        // kullanicidan bir string isteyin
        // ve String'in tersi ile kendisi ayni ise
        // verilen metin palindrom yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1; i >= 0 ; i--) {
            tersMetin += metin.charAt(i);
        }
        System.out.println("metnin ters hali: "+tersMetin);
        if (tersMetin.equals(metin)){
            System.out.println("verilen metin palindromdur.");
        }
    }
}
