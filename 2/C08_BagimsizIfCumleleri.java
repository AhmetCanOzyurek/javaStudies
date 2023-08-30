package day02_operatorler;

import java.util.Scanner;

public class C08_BagimsizIfCumleleri {
    public static void main(String[] args) {
        int a = 110;
        int b = 27;

        if (a > b) {
            System.out.println("a b'den büuük");
        }

        if (a % 2 ==0){
            System.out.println("a sayisi cift bir sayidir.");
        }

        if (b % 5 == 0)
            System.out.println("b sayisi 5 ile tam bolunebilir."); // ilk noktalı virgüle kadar body kabul edilir.
        // kod okuma sorularında süslü parantezlerin olmadığı sorularda gelecek.

        // kullanıcıdan bir ucgenin 3 kenar uzunlugunu alin
        //ucgen eskenar ise eskenar ucgen

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ğçgenin kenarlarını girinizç");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();
        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 >0) { // java üç tane karşılaştırma yapmaz. and veya or ile bölmen lazım.
            System.out.println("Girilen değerler bir eşkenar oluşturur.");
        }

        System.out.println("Lutfen bir harf giriniz");
         String cgr;
        cgr = scanner.next();



    }
}
