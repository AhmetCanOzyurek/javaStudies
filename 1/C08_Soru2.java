package day01_programlamayagiris;

import java.util.Scanner;

public class C08_Soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dbl = scanner.nextDouble();
        int in = scanner.nextInt();
       double toplam = dbl + in;
        double çarpma = dbl * in;
        System.out.println("çarpma işlemi: "+ çarpma + "toplama işlemi" + toplam);
    }
}
