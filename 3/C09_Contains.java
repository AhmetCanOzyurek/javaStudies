package day03_SwitchStatements_StringManipulations;

public class C09_Contains { // içerir mi?
    public static void main(String[] args) {
        String str= "Java cok guzel, cok.";

        System.out.println(str.contains("Java")); // True
        System.out.println(str.contains("java")); //false
        System.out.println(str.contains("cok")); // true
        System.out.println(str.contains("a")); // true
        System.out.println(str.contains(" ")); //true
        System.out.println(str.contains("")); //true string içerisinde harfler arasında hiçlik bulunur.

    }
}
