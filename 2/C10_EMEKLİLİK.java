package day02_operatorler;

import java.util.Scanner;

public class C10_EMEKLİLİK {// Nested if else statements
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz: erkek : E, kadın : K ");
        char cinsiyet = scanner.next().charAt(0);

        //kodun daha anlaşılır ve daha fazla kontrol edilebilir olması için
        // Nested if else kullanılabilir.
         //birden fazla degisken oldugunda
        // ana degiskeni secelim. bu soruda ana degisken cinsiyet olsun
        // ana degiskeni secerken birinci önceliğim olabilecek en az ihtimali barındıran durumu seçmek.

        if (cinsiyet == 'E' || cinsiyet =='e') { //sadece erkekler bu suzgecten gecer.
            if (yas < 10  || yas > 85){
                System.out.println("Erkek icin gecersiz yas.");
            } else if (yas >= 65) {
                System.out.println("Erkek emekli olabilir.");
            }else
                System.out.println("Erkek emekli olabilmek için " + (65-yas)+" sene daha calısmalıdır.");
        } else if (cinsiyet == 'K' || cinsiyet == 'k') {//sadece kadınlar bu suzgecten gecer.
            if (yas < 10  || yas > 85){
                System.out.println("Kadın icin gecersiz yas.");
            } else if (yas >= 60) {
                System.out.println("Kadın emekli olabilir.");
            }else
                System.out.println("Kadın emekli olabilmek için " + (60-yas)+" sene daha calısmalıdır.");
        }




    }
}
