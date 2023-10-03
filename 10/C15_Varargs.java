package day10_passByValue_Immutable_dateTime;

public class C15_Varargs {
    public static void main(String[] args) {
        // verilen degisken sayidaki int argumentten
        //ilki haric geriye kalanlari toplayip
        // bulunanan toplam degeri ile ilk argumenti carpip
        // sonucu yazdiran bir metghod olusturun.
        islemYap(1,2,3);//5

        islemYap(3);
        baskaIslemYap("Ali","Veli",2,3,5,4);
        baskaIslemYap("a","b");
    }
    private  static void islemYap ( int ilkSayi, int... sayilar){
        // sayilar yollanan tum argumentleri olan bir arraydir

        int elementlerToplami = 0;
        for (int i = 0; i < sayilar.length ; i++) {
            elementlerToplami += sayilar[i];
        }

        System.out.println("istenen islem sonucu : " + elementlerToplami*ilkSayi );
    }

    public static void baskaIslemYap(String s, String k, int ... sayilar){
        //int sayilari toplayip,
        // ilk iki string arasinda toplam degeri yazdirin.
        int toplam = 0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam += sayilar[i];
        }
        System.out.println(s+toplam+k);
    }
}
