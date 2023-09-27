package day09_Constructors_StaticKeyword;

public class C09_PassByVAlue {
    public static void main(String[] args) {
        String str = "Java Candir";

        //Bir method olusturarak a harflerini silip, yeni halini main methoda dondurun.

        System.out.println("method call: " +aLariSil(str));
        System.out.println("method call sonrasi main methodda str: "+ str);

        // main methoddaki str'in kalici olarak a'siz olmasini istersek ATAMA  yapariz

        str = aLariSil(str);
        System.out.println("kalici hale getirmek icin atama yaptiktan sonra str: "+str);// kalici olarak Jc Cndir.
    }

    public  static String aLariSil(String str){
        str = str.replace("a","");
        System.out.println("method icinde a'siz str: " + str);
        return str;
    }
}
