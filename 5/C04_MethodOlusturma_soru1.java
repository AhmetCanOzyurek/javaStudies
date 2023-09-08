package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

public class C04_MethodOlusturma_soru1 {
    public static void main(String[] args) {
        // soru-1 kullanicidan input olarak verilen bir string,
        //          baslangic ve bitis indexleri alip
        //          verilen indexlere gore baslangic index'i dahil, bitis index'i haric
        //          olacak sekilde oradaki harfleri yazdiran bir method olusturn.
        //          - kullanici baslangic degeri olara, bitis degerinden buyuk bir sayi girerse
        //          hata mesajı
        //          - kullanici str'da olan indexlerdendaha buyuk bir index girerse hata mesajı yazdirin.

            kendiSubstringimiz("ahmet can ozyurek",0 ,8);
            kendiSubstringimiz("ahmet can",7,3);
            kendiSubstringimiz("ahmet can",2,10) ;
    }//main sonu
    public static void kendiSubstringimiz(String metin, int basIndex,int bitIndex){
        //java candir bas:2 bit: 7 output ====> va Ca
        if(basIndex > bitIndex){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz.");
        }else if(basIndex > metin.length() ||bitIndex> metin.length()){
            System.out.println("Girilen indexler sınırlarin disinda");
        }else{
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }
} // class sonu
