package day03_SwitchStatements_StringManipulations;

public class C12_Indexof {
    public static void main(String[] args) { //string icerisndeki ilk uyusan indexini yazdırır
        String str = "Java cok sevkli, her ders Java gibi olsa";
        System.out.println(str.indexOf("li")); //13

        System.out.println(str.indexOf("er")); //18

        System.out.println(str.indexOf("er",19)); //22

        //str'daki ilk 3 a harfinin indekslerini yazdirin.

        // once ilk a'nın indexini bul,
        int ilkİndex = str.indexOf('a');
        System.out.println("ilk index : "+ ilkİndex);
        // ilk a'dan sonraki metne bak ve 2'a nın indexini bul
        int ikinciİndex = str.indexOf('a', ilkİndex+1);
        System.out.println("ikinci index: "+ ikinciİndex);
        // sonra 2.a dan sonraki metne bak ve 3.anın indexini bul
        int ucuncuİndex = str.indexOf('a',ikinciİndex+1);
        System.out.println("ucuncu index: "+ ucuncuİndex);

        System.out.println(str.indexOf("q")); // -1 , eğer bir karakter string içerinde yoksa java onun indexini -1 olarak yazdirir.

         ilkİndex = str.indexOf('J');
        System.out.println("ilk index : "+ ilkİndex);
        // ilk J'dan sonraki metne bak ve 2'a nın indexini bul
         ikinciİndex = str.indexOf('J', ilkİndex+1);
        System.out.println("ikinci index: "+ ikinciİndex);
        // sonra 2.J dan sonraki metne bak ve 3.anın indexini bul
         ucuncuİndex = str.indexOf('J',ikinciİndex+1);
        System.out.println("ucuncu index: "+ ucuncuİndex);

    }
}
