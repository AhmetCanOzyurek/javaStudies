package day03_SwitchStatements_StringManipulations;

import java.util.Locale;

public class C03_ToUpperCase_ToLowerCase {
    public static void main(String[] args) {
        //stringteki değişiklikleri atamadıkça yaptığımız işlemler kalıcı olmaz.
        // bu sadece string için geçerlidir.
        String str = "Java Candir";

        System.out.println(str.toUpperCase());//JAVA CANDIR
        System.out.println(str); // Java Candir.
        str=str.toLowerCase();

        System.out.println(str);//java candir

        str = "JAVA CANDIR ";
        //kucuk harfe donusturelim
        //ancak I harfini Turkcedeki kucuk ı olarak yapsin.

        System.out.println(str.toLowerCase(Locale.CHINA)); //Java candir.
        str = str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str);
    }
}
