package day01_programlamayagiris;

public class C011_Explicit {
    public static void main(String[] args) {
        int sayi1 = 25;
        byte byt = (byte)sayi1;
        System.out.println(byt);

        int sayi2 = 128;
        byte byt2 = (byte)sayi2;
        System.out.println(byt2); // -128

        int sayi3 = 133;
        byte byt3 = (byte)sayi3;
        System.out.println(byt3); // -123

        int sayi4 = 256;
        byte byt4 = (byte)sayi4;
        System.out.println(byt4); // 0

        int sayi5 = 523;
        byte byt5 = (byte)sayi5;
        System.out.println(byt5); // 11

        double dbl = 12.99999;
        int sayi6 = (int) dbl;
        System.out.println(sayi6);

        int a = 24;
        int b= 6;

        System.out.println(a/b); // 3,125

        a = 25 ;
        b = 8;
        System.out.println(a / b);
        double c = a/b;
        System.out.println(c); // 3.0
        double x = 25;
        int y = 8;

        System.out.println(x/y);

        c = (double) a/b;
        System.out.println(c);


    }
}
