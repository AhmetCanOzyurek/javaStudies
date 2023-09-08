package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

public class C03_dethodOlusturma {
    public static void main(String[] args) {
        faktoriyelHesapla(5);

    }//main sonu
public static int faktoriyelHesapla(int sayi) {
    //input: 5 faktoryel : 5 * 4 * 3 * 2 * 1 = 120
    int faktoryel = 1;
    for (int i = 1; i <= 6; i++) {
        faktoryel *= i;
    }

    System.out.println(faktoryel);
    return  sayi;
}


}//class sonu
