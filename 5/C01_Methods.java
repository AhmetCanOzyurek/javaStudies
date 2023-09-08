package day05_MethodOlusturma_WhileLoops_DoWhileLoops_Scope;

public class C01_Methods {
    public static void main(String[] args) {
        String str = "JAva candir";
        System.out.println(str.toUpperCase());
        //yazılım dünyasında her şey requirements'a göre yapılır. Ne istenilense o. Ne isteniyorsa o.
        //void fatura ve makbz örneği.

        str.substring(3);  //method çalışır ama bize bir faydası yok


        System.out.println(str.substring(3));
        /* method calisi, istenen islemin  sonucunu bize dondurur
        biz de yazdirdiğimizi icin bu sonucu goruruz
        ama sonucu kaydetmedgimiz icin bu methodun calismasi ve bize getirdigi sonuc
        sadece 14. satırla sinirli olur.
         */

        String istenenParca = str.substring(3);
        /* method calisir istenen parcayi bize döndürür
        biz o metni kaydetmis oluruz
        biz suan icin kaydedilen parcayi istesek de goremeyiz
        kaydettigimiz icin istersek yazdirir, istersek de ilerde kullanabiliriz.
         */

        System.out.println(istenenParca);
        // hangi methodu kullanacağımız requirements ile ilgilidir. istenilen şeye göre hazırlarız.
        //method isimleri kucuk harflerle baslar ve camelCase kullanılır.
        //methodlar main methodunn icinde olusturulmaz  .
        C02_methodOlusturma.isimDuzenleYazdır("markus","antonius"); // bir sonraki class'tan method çağırdık.
    }
}
