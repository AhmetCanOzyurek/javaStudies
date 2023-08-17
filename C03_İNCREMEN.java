package day02_operatorler;

public class C03_İNCREMEN {
    public static void main(String[] args) {
        // increment isleminin kalici olması icin 3 farkli şekilde assignment yapılabilir.
        //1
        int sayi =10;
        sayi = sayi + 3;

        //2
        int sayi1 = 10;
        sayi1 += 3;
        System.out.println(sayi1);
        sayi1 *= 3;
        System.out.println(sayi1);
        //3
        int sayi2 = 10;
        sayi2++; // sayıyı bir bir arttırır.


        //Decremen = sayı azaltma işlemleri.

        int sayi3 = 10;
        sayi3 = sayi3-3;

        sayi3-= 3;

        sayi3--;
    }
}
