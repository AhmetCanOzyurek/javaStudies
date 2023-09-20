package day08_ArrayLists_foreachLoop;

public class C13_HemsireRunner {
    public static void main(String[] args) {

        C12_Hemsire hemsire1 = new C12_Hemsire();

        System.out.println(hemsire1.isim); //null
        hemsire1.isim = "Ayse" ;
        hemsire1.soyisim = "Can";
        hemsire1.adres = "Cankaya";

        System.out.println(hemsire1.isim);

        C12_Hemsire hemsire2 = new C12_Hemsire();
        hemsire2.isim = "Yasemin";
        hemsire2.yas = 25;

        System.out.println(hemsire2.isim);
        /*
        java her classtan bir obje olusturulmasını sağlamak icin default bir constructor vardırr



        methodlarla constructorların farkı

        method return type

        constructor no return type

        constructorlar static olmaz

        classın içinde olusturulur

         */

        /*
        Default constructor görünmez
        Default contructor, parametresizdir ve body'si bostur

        Biz default constructor ile ayni islevi yapan
        gorunur constructor olusturabiliriz
        Ancak gorunun olarak olusturdugumuz bu constructor'a
        default cons denmez
        parametresiz construcktor denir
         */
    }

}
