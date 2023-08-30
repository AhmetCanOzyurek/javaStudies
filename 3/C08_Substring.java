package day03_SwitchStatements_StringManipulations;

public class C08_Substring {
    public static void main(String[] args) {
        String str = "Java Candir";
        //iki turlu substring alinabilri.
        //1-verilen index ve sonrasi

        System.out.println(str.substring(5)); //Candir
        System.out.println(str.substring(1)); //ava Candir

        //son 4 karakteri yazdirin
        System.out.println(str.substring(str.length()-4)); //ndir

        System.out.println(str.substring(str.length() - 1));//r
        System.out.println(str.substring(str.length())); //hiclik

        //System.out.println(str.substring(15));//hata

        //2-verile iki index'in arasi

        System.out.println(str.substring(0,4)); // 0 index dahil 4. index hariç
        System.out.println(str.substring(5,8)); //can
        //eger tek bir harfe string olarak ulaşmak istersek kullanilabilir.
        System.out.println(str.substring(7,8)); //n
        //str'nin ilk harfini kuçuk yazdıralım
        System.out.println(str.substring(0, 1).toLowerCase()); //j

        // baslangic index'i bitis index'inden buyuk olursa
        //System.out.println(str.substring(8,5)); // String indexoutofboubdsexception

        System.out.println(str.substring(9,9)); //hiclik
    }
}
