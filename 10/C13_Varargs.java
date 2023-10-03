package day10_passByValue_Immutable_dateTime;

public class C13_Varargs {
    public static void main(String[] args) {
        toplama(3,5);
        toplama(3,5,7);
    }
/*
bis class'da ayni islemi yapacak ama
argument sayisi degşsen farkli methoddlara ihtiyac varsa
VArargs kullanilabilir

toplama(3,6,7);
toplama (3,6,7,10,14);
toplama(3,6,7,10,14,20);

 */

    public static void toplama(int sayi1, int sayi2){

        System.out.println("2 sayinin toplami: "+ (sayi1+sayi2));
    }
    public static void toplama(int sayi1, int sayi2, int sayi3){

        System.out.println("3 sayinin toplami: "+ (sayi1+sayi2+sayi3));
    }
}
