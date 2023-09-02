package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C06_SifreKontrol {
    public static void main(String[] args) {
      /*
      soru 4 kullanıcıdan bir sifre isteyip, asagidaki sartlari kontrol edin
                ve kullaniciya duzeltmesi gereken tum eksiklikleri soyleyin.
                eger tum sartlar saglarsa, "sifre basari ile kaydedildi" yazdirin
                -ilk harf kucuk olmali
                - son karakter rakam olmali
                - sifre bosluk icermemeli
                - uzunluğu en az 10 karakter olmali
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

        char ILkHarf = sifre.charAt(0);
        int sayac = 0; // sifremiizin dogru olup olmadigini kontrol edecek elemanımız.
        //-ilk harf kucuk olmali
        if(ILkHarf >= 'a' && ILkHarf <='z') {
            sayac++;
        }else{
            System.out.println("ilk harf kucuk olmali");
        }

        //- son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (sonKarakter >= '0' && sonKarakter <= '9'){
            sayac++;
        }else{
            System.out.println("son karakter rakam olmali");
        }

        // - sifre bosluk icermemeli

        if(sifre.contains(" ")){
            System.out.println("Sifrede bosluk olmamali");
        }else{
            sayac++;
        }

        //- uzunluğu en az 10 karakter olmali

        if(sifre.length() >= 10){
            sayac++;
        }else{
            System.out.println("Sifre 10 veya üzeri karakterden olusmali");
        }
        if (sayac == 4){
            System.out.println("Sifreniz basarı ile kaydedildi.");
        }

    }
}
