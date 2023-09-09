package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

import java.util.Scanner;

public class C07_WhileLoops {
    public static void main(String[] args) {
        /*
        Kullanicidan toplama üzere int sayilar isteyin
        kullanici 0'a basana kadar girilen sayilari toplayin
        kullanici 0'a bastiginda programi bitirip,
        girilen sayilarin toplamini yazdirin.
         */

        //Tekrar sayisi belli olmayan durumlarda
        // For loop kullanımı tercih edilmez.
        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen toplamak istediginiz sayıları giriniz. Toplama işlemini bitirmek icin 0'a basiniz.");
        int finish = 1; //  ister Boolean finish = true; kullanıp while'a entegre edersin. istersen de bu şekilde kullanabilirsin. Angela ablamız böye kullanıyor genelde.
        int toplam = 0;
        while (finish != 0){
            int sayilar = scanner.nextInt();
            toplam += sayilar;
            if (sayilar == 0){
                System.out.println("Sayilarin toplami : " + toplam);
                finish = 0;
            }
        }
    }
}
