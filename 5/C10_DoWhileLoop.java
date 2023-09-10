package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

import java.util.Scanner;

public class C10_DoWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan tuttuğumuz bir sayiyi tahimin etmesini isteyin
        // bizim sayimiz 1 -100 arasında olacak
        //
        // tahminin kucukse büyültmesini
        // büyükse kucultmesini isteyin.

        int tutulanSayi= 60;
        int girilenSayi=0;
        int sayac =1;
        Scanner scanner=new Scanner(System.in);
        while(tutulanSayi != girilenSayi){
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
        }

    }
}
