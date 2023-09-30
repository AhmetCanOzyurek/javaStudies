package day10_passByValue_Immutable_dateTime;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {
        int[] sayilar  = { 3,6,7};
        System.out.println("main method'da array'in ilk hali: " + Arrays.toString(sayilar));
        System.out.println("Method'dan sonuc olarak donen array: "+ Arrays.toString(sayilariArtir(sayilar)));
        System.out.println("method call'dan sonra array'in son hali: "+ Arrays.toString(sayilar));
    }

    public static int[] sayilariArtir(int[] sayilar){
        //bu method array'deki elementleri 1 artirip geri donurur
        // sayilar : {3,6,7}

        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i] +=1;
        }
        System.out.println("method icindeki array'in so hali : " + Arrays.toString(sayilar));
        return sayilar;
    }
}
   