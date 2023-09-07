package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C16_NestedForLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan satır ve sütün sayısını alıp bir dikdörtgen bastırın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sütün sayısı giriniz: ");
        int sutun = scanner.nextInt();
        System.out.println("Lutfen satır sayisi giriniz: ");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {
            for (int j = 1; j <= sutun;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
