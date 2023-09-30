package day10_passByValue_Immutable_dateTime;

import java.util.ArrayList;
import java.util.List;
public class C05_PassByValueLİst {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Cem");
        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Reyyan");
        System.out.println(isimler);

        System.out.println("Main method'da listenin ilk hali: "+ isimler);
        isimDegistir(isimler);
        System.out.println("Main method'da isimDegistir()'den sonra: "+isimler);


    listDegistri(isimler);
        System.out.println("main method'da listDegistir() den sonra: " +isimler);
    }
    public static void isimDegistir(List<String> isimler){
        isimler.set(0,"Ali");
        isimler.set(1,"Veli");
        isimler.set(2,"Can");
        System.out.println(" isim degistir methodunda son hali :" + isimler);

    }

    public static void listDegistri(List<String> isimler){
        isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("can");
        System.out.println("list degistir method'unda son hali: "+ isimler);
    }
}
