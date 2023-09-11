package day06_scope_arrays;

public class C02_ClassVariables {

    /*
    Class level'de olusturulan static olarak etiketlenen variable'lar
    class icindeki her yerden kullanilabilir
     */

    /*
    Class level'da olusturulan ama static olarak ETİKETLENMEYEN variable'lar (İNSTANCE VARİABLE) static method'lardan direk kullanilamaz.
     */



    int classlevetInt=25;//İNSTANCE VARİABLE
    static String classLeverStr = "Java Candir.";//ayni class icindeki butun methodlar tarafından kullanılabilir.

    public static void main(String[] args) {
        System.out.println(classLeverStr);

        for (int i = 0; i <10 ; i++) {
            System.out.println(classLeverStr);
        }

    }//main sonu

    public static void method1(){
        //System.out.println(classLevelInt); // Eğer method static, variable static değil ise method bu static olmayan (sıçılmış kişi) variable'ı kabul etmez. Itkçı oezecenk

        classLeverStr = "Java Güzeldir";
        System.out.println(classLeverStr);
    }

    public void method2(){
        System.out.println(classlevetInt); // eger method ve variable static (seçilmişler kulübü/üstün ırka ait değil) değil ise  method bu variable'yi kullanabilir.
    }


}//class sonu
