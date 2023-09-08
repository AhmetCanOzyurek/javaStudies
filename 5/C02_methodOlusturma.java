package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

public class C02_methodOlusturma {
    public static void main(String[] args) {
        // verilen isim ve soyismi ilk harf buyuk , diger hasrfler kucuk harf olacak sekilde duzenleyip
        // yazdıracak bri metho olusturun.


        isimDuzenleYazdır("AYKUT","MART");
        isimDuzenleYazdır("Mert","ayhan");
    }//main sonu
    public static void isimDuzenleYazdır(String isim, String soyisim){

        String duzenleIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+
                " " +
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();


        System.out.println(duzenleIsim);
    }


}//class sonu
