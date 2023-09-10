package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

import java.util.Scanner;

public class C11_DoWhile {
    public static void main(String[] args) {
        int tutulanSayi= 60;
        int girilenSayi=0;
        int sayac =1;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("lutfen bir tahmin giriniz");
            girilenSayi = scanner.nextInt();
            if (girilenSayi < tutulanSayi){
                System.out.println("daha buyuk");
                sayac++;
            } else if (girilenSayi> tutulanSayi) {
                System.out.println("daha kucuk");
                sayac++;
            }else{
                System.out.println(sayac+ " tahminde bildiniz.");
            }
        }while(tutulanSayi != girilenSayi);
    }

    /*
        bugune kadar toplam 3 loop gorduk
        1- for loop:
            baslangıc ve bitis degerleri belli ise veya tekrar sayisi belli ise tercih edilir.
        2- while loop:
        tekrar sayisi belli olmayan durumlarda kullanılır.
            for loop'un uzmanligi olan sorulardad while loop kullanilirsa
            baslangic degeri bitis degeri ve artim seklinin manuel olarak girilmesi gerekir.
            bu da cok pratik degildir.
         3- do - while loop
                 kullanicidan deger alip bir islem yapmak gibi durumlarda kullanicidan almadan ekndimiz deger atadigimizda hatalar olusabilirç
                 while kontrol yapilmadan
                 Loop'un en azindan bir kere calismasini isterseniz
                 while loop yerine do while loop tercih edilir.


     */
}
