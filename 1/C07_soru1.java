package day01_programlamayagiris;

import java.util.Scanner;

public class C07_soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullanıcıİsmi = scanner.nextLine();
        int sayi = scanner.nextInt();
        double sayi1 = scanner.nextDouble();

        System.out.println(sayi + " Bu int bir değerdir." );
        System.out.println(sayi1 + " Bu double bir değerdir.");
        System.out.println(kullanıcıİsmi  +" Bu string bir değerdir.");
    }
}
