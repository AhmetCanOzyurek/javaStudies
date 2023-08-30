package day04__Stringmanupilation_ForLoops;

import java.util.Scanner;

public class C04_BilgiGizleme {
    public static void main(String[] args) {
        /*kullanıcıdan isim, soyisim ve kredi karti bilgisini alın

            asagıdaki sekilde yazdirin
            isim soyisim : o*** a***
            kredi kartı no = 1234 **** **** ****
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen kart numaranızı,  isminizi ve soyisminizi giriniz.");

        String kkno= scanner.nextLine();
        String isim = scanner.next();
        String soyisim = scanner.next();
       String yazdirilacakKkNo = kkno.substring(0,4)+
                                 kkno.substring(4).replaceAll("\\d","*");

       String yazdirilacakİsim = isim.substring(0,1)+
                                 isim.substring(1).replaceAll("\\w","*");

       String yazdirilacakSoyisim = soyisim.substring(0,1)+
                                    soyisim.substring(1).replaceAll("\\w","*");


        System.out.println("isim soyisim : "+ yazdirilacakİsim + " " + yazdirilacakSoyisim+
                "\nKredi Kartı No: " + yazdirilacakKkNo);

    }
}
