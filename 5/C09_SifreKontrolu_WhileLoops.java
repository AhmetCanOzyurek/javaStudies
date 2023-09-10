package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

import java.util.Scanner;

public class C09_SifreKontrolu_WhileLoops {
    public static void main(String[] args) {
        // Kullanicidan main method icinde sifre isteyin
        //girilen sifreyi sifreKontrolEt method'unda kontrole edip
        // assagidaki sartlari saglamayan sifrelerde hatalari yazdirin
        // nethod, sifre gecerli ise true, gecersiz ise false dondursun
        // donen cevabi kontrol edin
        // kullanicidan yeni sifre girmesini isteyin
        // gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilince "sifreniz basari ile kaydedildi" yazdirin
        // sartlar:
        Scanner scanner = new Scanner(System.in);

        String girilenSifre = null;
        //while loop methoddan gelen sonuç false olduğu müddetçe devam edecek.
        boolean finish = false;
        while (!finish){// bunun asıl hali finish == false
            System.out.println("lutfen bir sifre giriniz");
            girilenSifre=scanner.nextLine();
            finish = sifreKontrolEt(girilenSifre);
        }

    }//main sonu

    public static boolean sifreKontrolEt(String sifre){
        int sayac = 0;
        //      -sifrenin ilk karakteri kucuk harf olmali
        char ilkKarakter = sifre.charAt(0);
        if (!(ilkKarakter >= 'a' && ilkKarakter<= 'z')){
            System.out.println("Ilk karakter kucuk harf olmali");
            sayac++;
        }
        //      -sifrenin son karakteri sayi olmali.
        char sonKarakter =sifre.charAt(sifre.length()-1);

        if(!(sonKarakter >='0' && sonKarakter <= '9')){
            System.out.println("son karakter sayi olmali");
            sayac++;
        }
        if(sayac ==0){
            return true;

        }else{
            return false;

        }
    }
}
