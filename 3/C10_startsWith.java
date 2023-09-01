package day03_SwitchStatements_StringManipulations;

public class C10_startsWith{
    public static void main(String[] args) {
        String str= "Java cok guzel, cok.";
        //tek parametreli kullanımı
        System.out.println(str.startsWith("J")); //True

        //iki parametreli kullanma
        System.out.println(str.startsWith("cok",5));

        //endswith bir string baska bir string ile bitmediğini kontrol eder.

        System.out.println(str.endsWith("cok.")); // true
        System.out.println(str.endsWith("")); //true
    }
}
