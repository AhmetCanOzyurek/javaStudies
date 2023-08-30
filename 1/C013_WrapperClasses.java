package day01_programlamayagiris;

public class C013_WrapperClasses {
    public static void main(String[] args) {
        int sayi = 10;
        Integer sayıInteger = sayi;
        int sayi2 = sayıInteger;
        //string str = sayi;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        Wrapper class'lar, primitive  data turlerinin hazir methodlar kullanöası icin olusuturulmustur.
        primitive data türleri ile wrapper class'lar arasında rahatca gecis yapilabilir.

         */

        String str1= "25";
        String str2 = "40";

        //string olarak verilen iki sayiyi toplama.
        System.out.println(str1 +str2);
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));

        char chr1 = '5';
        //kucuk harf olarak verilen char degerini buyuk harf olarak yazdırın.
        System.out.println(Character.toUpperCase(chr1));

        // verilen karakterin harf olup olmadığını kontrol edin.
        System.out.println(Character.isLetter(chr1));

        // verilen karakterin sayi olup olmadığını kontrol edin.
        System.out.println(Character.isDigit(chr1));
    }
}
