package day01_programlamayagiris;

import java.util.Scanner;

public class C09_soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kısaKenar = scanner.nextInt();
        int uzunKenar = scanner.nextInt();
        int alan = kısaKenar  *uzunKenar;

        System.out.println(alan);
    }
}
