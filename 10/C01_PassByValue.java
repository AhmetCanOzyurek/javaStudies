package day10_passByValue_Immutable_dateTime;

public class C01_PassByValue {
    public static void main(String[] args) {


        int sayi = 10;
        // String sayi = ""; bir scope ta ayni isimde farkli bir variable olusturamayiz
        String str = "Java";
        method2(str);
    }

    public static void method2(String asd){
        //System.out.println(sayi);

        int sayi = 20;
        System.out.println(asd);
    }
}
