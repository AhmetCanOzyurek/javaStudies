package day08_ArrayLists_foreachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C09_foreacLoop {
    public static void main(String[] args) {
        /*
        soru 4- kullancidan bir cumle ve bir harf alim
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin
        kullanilmadiyasa zharf cumlede kullanilmis" yazdirin

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scanner.nextLine(); // ali okua git

        System.out.println("lutfen bir harf giriniz");
        String harf = scanner.next().substring(0,1);

        String[] harfler = cumle.split("");
        System.out.println(Arrays.toString(harfler));//[a, l, i,  , o, k, u, l, a,  , g, i, t]
           int sayac = 0;
        for (String each : harfler
             ) {
            if(each.equals(harf)){
                sayac++;
            }
        }
        if(sayac == 0){
            System.out.println("verilen harf cumlede kullanilmamis");
        }else{
            System.out.println("verilen harf cumlede: "+ sayac+ " defa kullanılmıs");
        }
    }
}
