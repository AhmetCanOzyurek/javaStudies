package day04__Stringmanupilation_ForLoops;

public class C05_StringManipulations_soru2 {
    public static void main(String[] args) {
        /*
        sour2 : kullanicinin belirli bir formatta verdigi
        String fiyatlari toplayip yazdirin
        input1: "15.30 €" ;
        input2 : "11.40 €";
        output : "26.70 €":
         */
        String input1 = "15.30 €";
        String input2 = "11.40 €";

        String SadeceSayılar = input1.replaceAll("\\D","");
        String SadeceSayılar2 = input2.replaceAll("\\D","");

        int sayi1 = Integer.parseInt(SadeceSayılar);
        int sayi2 = Integer.parseInt(SadeceSayılar2);


        double sonuc = (double)(sayi1+sayi2) /100;
        System.out.println(sonuc +"€"); //26.70 €





    }
}
