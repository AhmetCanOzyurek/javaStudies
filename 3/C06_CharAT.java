package day03_SwitchStatements_StringManipulations;

import java.net.BindException;

public class C06_CharAT {
    public static void main(String[] args) {
        String str = "Java Candir";//bosluğu gormezden gelme.
        System.out.println(str.charAt(5));//C
        // sondaki harfi yazdirin

        System.out.println(str.charAt(10)); //r

        //bu metinde kac karakter var? 11

        System.out.println(str.charAt(11-1));

        //sondan ucuncu harfi yazdirin

        System.out.println(str.charAt(11-3)); //

        //System.out.println(str.charAt(-2)); StringİndexOutOfBoundsException
        /*
        System.out.println(str.charAt(23));
        System.out.println(str.charAt(11));
        bu method ile kullanabileceğimiz en buyuk index
        uzunluk -1 'dir.
        */
    }
}
