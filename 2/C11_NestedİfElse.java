package day02_operatorler;

import java.util.Scanner;

public class C11_NestedİfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int adet = scanner.nextInt();

        System.out.println("Lutfen urunun liste fiyatını giriniz.");
        double listeFiyatı = scanner.next().charAt(0);

        System.out.println("Musteri kartınız var mı ? \nE : evet, H : hayır");
        char kartVarMİ= scanner.next().charAt(0);

        if (kartVarMİ == 'E' || kartVarMİ == 'e'){
            if (adet <=0){
                System.out.println("urun adedi hatali. ");
            } else if (adet<=10) {
                System.out.println("%15 indirimli toplam fiyat : " + adet*listeFiyatı*85/100);
            }else {
                System.out.println("%20 indirimli toplam fiyat : " +adet*listeFiyatı*80/100);
            }
        }else if (kartVarMİ == 'H' || kartVarMİ == 'h'){
            if (adet <=0){
                System.out.println("urun adedi hatali. ");
            } else if (adet<=10) {
                System.out.println("%10 indirimli toplam fiyat : " + adet*listeFiyatı*90/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " +adet*listeFiyatı*85/100);
            }
        }
    }
}
