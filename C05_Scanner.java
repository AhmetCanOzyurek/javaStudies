package day01_programlamayagiris;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminiz giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("lutfen soyisminizi giriniz: ");
        String soyİsim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz: ");
        String yas = scanner.nextLine();
        System.out.println("İsminiz : " + isim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmıştır.");
    }
}
