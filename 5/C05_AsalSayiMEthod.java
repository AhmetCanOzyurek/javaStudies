package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

import java.util.Scanner;

public class C05_AsalSayiMEthod {
    public static void main(String[] args) {
         // soru -3 Kullanicidan main method icinde pozitif bir tamsayi alin
            // girilen sayinin asla sayi olup olmadigini kontrol edip,
        // sonuc olarak "asal sayi" veya "asal sayi degil olarak
        // cıktı alın .
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen  kontrol etmek icin pozitif bir tamsayi girin");
        int girilenSayi= scanner.nextInt();

        System.out.println(asalSayiKontrol(girilenSayi));

    }//main sonu
        public static String asalSayiKontrol (int girilenSayi){
           int flag = 10;
            for (int i = 2; i <girilenSayi ; i++) {
                if (girilenSayi % i == 0){
                    flag++;
                    System.out.println(i + "'ye bölünür");
                    break;
                }
            }
            if(flag == 10 ){
                return "Asal sayi";
            }else{
                return "Asal Degil";
            }
        }
}//class sonu
