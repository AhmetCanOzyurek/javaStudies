package day03_SwitchStatements_StringManipulations;

public class C07_Length {
    public static void main(String[] args) {
        String str ="Ahmet uzunkavaklaraltındayataruyumazoglu";
        System.out.println(str.length());//40
        System.out.println(str.charAt(40-1)); //u


        //bu eyi bir yazılım değil.
        // dinamik bir yazilim yazmaya önem göstermek gerekir.

        System.out.println(str.charAt(str.length()-1));

        // sondan ucuncu karakteri

        System.out.println(str.charAt(str.length()-3));


    }
}
