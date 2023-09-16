package day07_ArrayiListeyeCevirme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13_KullaniciyaListOlusturma {
    public static void main(String[] args) {


        System.out.println(QList());
    }

    public static List<String> QList() {
        List<String> isimler = new ArrayList<>();

        String girilenIsim = "";
        Scanner scanner = new Scanner(System.in);
        while (!girilenIsim.equalsIgnoreCase("Q")) {
            System.out.println("Listeye eklemek icin isim yazin\n Bitirmek icin Q'ya basin");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")) {
                isimler.add(girilenIsim);
            }

        }
        return isimler;
    }
}
