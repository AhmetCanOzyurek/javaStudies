package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

public class C06_OverLoading {
    public static void main(String[] args) {
        String str = "Java Candir";
        topla(5,6); // int int
        topla(5.4,6); // double int
        topla(6,5.4); // int double  /// bu call'a verdigimiz veriler hem double variable'ina hem de int variable'ına uyuyor. Java hangisini seçecek. En az casting olanını seçecek. neden  çünkü üşengeç.
        topla(3.4,5.3);
        topla ('a','b');

    }
    /*
    Java'da bir class'da ayni isimde birden fazla method olusturulabilir.
    buna method overloading denir.
     */
    public static void topla(int a, int b){
        System.out.println("iki tamsayinin toplami: " + (a + b));
    }//topla int int
    public static void topla (double a, int b){
        System.out.println("double ve int toplami: " + (a + b));
    }//topla double int

    public static void topla(int a, double b){
        System.out.println("int ve double toplami: " + (a + b));
    }//topla int double
    public static void topla(double a, double b){
        System.out.println("double double toplami: " + (a + b));
    }//topla double double

/*
Java da bir class'da ayni isimde birden fazla method olusturulabilir.
Buna method overloading denir.

* parametrelin adini degistirmek yeterli olmaz

*Java methodlara bakarken sadece method ismine degil,
method signature'ine bakar

*bir class'da ayni signature' a sahip  2 method olusturulmasına Java izin vermez.
methıd signature =  method ismi + parametre data turu 1 + pdt 2 + pdt3


 */

    /*
    Java bir overload(aynı isimdeki methodlar) methodlari cagirirken
    1- Methodlarin isimlerine
    2- Argüment(verilen degerler) - parametre uyumuna
        a- Parametre sayısına
    3- Casting'e bakar.

    /////CASTİNG = verdiğimiz degerler methodların auto widening , explicit narrowing etc. gibi islemleri yaptırıyorsa, Java işin KOLAYINA kaçar, gerektirmeyeni tercih eder.
     */




}
