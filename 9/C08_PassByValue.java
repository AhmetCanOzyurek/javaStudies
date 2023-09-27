package day09_Constructors_StaticKeyword;

public class C08_PassByValue {
    public static void main(String[] args) {


        int sayi = 10;

        kare41(sayi);

        System.out.println("method call sonrasi main method'da sayi degeri: " +sayi);//10
    }

    public static void kare41(int sayi){
        sayi *=sayi;
        System.out.println("verilen sayinin karesi: " + sayi); //100

        System.out.println("methoddan yapilan atama sonucu sayi degeri : " + sayi); //100
    }
}
