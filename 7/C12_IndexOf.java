package day07_ArrayiListeyeCevirme;

import java.util.ArrayList;
import java.util.List;

public class C12_IndexOf {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("cem");
        isimler.add("arda");
        isimler.add("Eyup");
        isimler.add("Ahmet");

        System.out.println(isimler);

        System.out.println(isimler.indexOf("Eyup")); // bastan baslayarak elementin hangi indexte oldugunu bize gosterir
        System.out.println(isimler.lastIndexOf("Eyup")); // sondan baslayarak arar

        System.out.println(isimler.indexOf("mehmet")); // bulamaz ama olsaydı nerede olacagını gosterir.              -1
        System.out.println(isimler.lastIndexOf("mehmet")); // sondan baslayarak nerede olacagını gosterir.         -1
    }
}
