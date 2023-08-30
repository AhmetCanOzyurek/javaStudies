package day02_operatorler;

import java.util.Scanner;

import static java.lang.Math.round;

public class C09_IfElseStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen agirliginizi kilo olarak girin.");
        double kilo = scanner.nextDouble();

        System.out.println("Ltfen boyunuzu santimetre olarak giriniz.");
        double boy= scanner.nextDouble();

        double vke = round(kilo*10000 / (boy*boy));

        System.out.println("Vucüt kitle endeksiniz : " + vke);

        if (vke>100|| vke < 10){
        }
        //

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int adet = scanner1.nextInt();

        System.out.println("Lutfen urunun liste fiyatını giriniz.");
        double listeFiyatı = scanner1.next().charAt(0);

        System.out.println("Musteri kartınız var mı ? \nE : evet, H : hayır");
        char kartVarMİ= scanner.next().charAt(0);
        if (adet <= 0 || (kartVarMİ == 'E'|| kartVarMİ == 'H')){
            System.out.println("Girilen bilgilerde hata var. \nKontrol edip tekrar giriniz.");
            adet = scanner.nextInt();
        }
        else if (kartVarMİ == 'E' && adet>10){
            System.out.println("%20 indirimli toplam fiyat : " +adet*listeFiyatı*80/100);
        }else if(kartVarMİ == 'E' && adet <= 10){
            System.out.println("%15 indirimli toplam fiyat : " + adet*listeFiyatı*85/100);
        }else if (kartVarMİ == 'H' && adet >10){
            System.out.println("%15 indirimli toplam fiyat : " + adet*listeFiyatı*85/100);
        }else if (kartVarMİ == 'H' && adet <=10){
            System.out.println("%10 indirimli toplam fiyat : " + adet*listeFiyatı*90/100);
        }else{
            System.out.println("HATALI GİRİŞ YAPTINIZ.");
        }

    }
}
