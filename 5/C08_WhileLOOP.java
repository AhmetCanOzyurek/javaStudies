package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

import java.util.Scanner;

public class C08_WhileLOOP {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere sayilar isteyin
        toplamı 500 olur
        veya geçerse toplami yazdirin.
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz sayilari giriniz.");
        int toplam = 0;
        Boolean finish = true;
        while (finish == true){
            int sayilar = scanner.nextInt();
            toplam += sayilar;
            if(toplam >= 500){
                System.out.println("HEehehee 500'e kadar topladım ehehehhe: "+ toplam);
                finish = false;
            }
        }
    }
}
