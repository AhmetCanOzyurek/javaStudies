package day10_passByValue_Immutable_dateTime;


import java.util.ArrayList;
import java.util.List;
public class C06_Mutable_ImmutableClasse {
    public static void main(String[] args) {
        /*
        Immutable class'lar sonradan deger atanamayan class'lardı
        ornehgin String,Integer,Char immutable classlardir
        String'de method ile yaptigimiz degisiklik kalici olmaz

        Mutable class'lar ise degistirilebilen class'lardir.
        Ornek : List
        List'de method ile yaptigimiz degisiklikler kalici olur.
         */

        String str = "Java Candir";
        System.out.println(str.toUpperCase());


        System.out.println(str);
        System.out.println(str.replaceAll("a", "b"));
        System.out.println(str);
        str = str.toUpperCase();

        System.out.println(str);//
        List<String> harfler = new ArrayList<>();
        harfler.add("a");
        harfler.add("b");
        harfler.add("c");
        System.out.println(harfler);

        harfler.set(1,"k");
        System.out.println(harfler);
    }
}
