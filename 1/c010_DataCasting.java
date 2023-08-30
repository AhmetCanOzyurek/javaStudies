package day01_programlamayagiris;

public class c010_DataCasting {
    public static void main(String[] args) {
        // tür dönüşümleri
        int int1 = 20;
        char chr1 = 'y';
        String str1 ="Java";
        short shr = 4;
        double dbl = 2.5;
      //  boolean bl1 = int1;
        //boolean bl1 = chr1;
        //boolean bl1 = str1; //boolean bir değişken başka bir değişken kabul etmez.

        // int sayi = str1;  int str kabul etmez.

        int sayi1 = chr1; // char kabul eder.
        sayi1 = shr; //short da kabul eder.
       // sayi1 = dbl1; //dbl kabul etmez.

        //short shr2 =  chr1;
        //shr2 = int1;
        //shr2 = dbl1; //etmez

        double dbl2 = chr1;
        dbl2 = shr;
        dbl2 = int1; // double kabul eder.

        // büyük data barındırabilen data değişkenleri küçüklerden alabilir ama büyükleri küçüklere vermeye çalıştığımızda java oluşacak veri kaybının sorumluğununu almaz. manuel olarak girmemiz gerekmektedir.
        //autoWidening;
        // data sıralaması.
        // byte < short < int < long < float < double.


    }
}
