package day03_SwitchStatements_StringManipulations;

public class C13_KullanıcıSayisiBulma {
    public static void main(String[] args) {
        /*
        kullacıdan bir cumle ve bir harf alın
        verilen cumle ve harfe göre asağıdaki cumlelerden
        uygun oanı yazdirin

        1 cumle harfi icermiyor
        2. cumlede harf sadece 1 kere kullanılmıs
        3. cumlede harf 1'den fazla kullanılmıs
         */

        String str = "Java ogrendikce guzellesiyor";
        String  arananHArf = "a";

        //oncearanan harfin ilk kullanım indexini bulalım
        int ilkİndex = str.indexOf(arananHArf);

        //aranan harfin ikinci indexini bulalim.
        int ikinciİndex = str.indexOf(arananHArf, ilkİndex+1);

        if (ilkİndex == -1){
            System.out.println("cumle harfi icermiyor");
        }else if (ikinciİndex == -1){
            System.out.println("Cumlede harf sadece bir kere kullanilmis");
        }else{
            System.out.println("cumlede harf 1'den fazla kullanılmıs");
        }


    }
}
