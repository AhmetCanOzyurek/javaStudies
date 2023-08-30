package day03_SwitchStatements_StringManipulations;

public class C04_Equals {
    public static void main(String[] args) {

        String str1= "Not";
        String str2= "NOT";
        String str3= "NOt";
        String str4= "Not";
        String str5 =new String("Not");
        String s = "N";
        String t ="ot";
        String str6 = s+t;

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1 == str5);
        System.out.println(str1 == str6);
        /*
        SIMDILIk : Java'da metinsel ifadelerin ayni olup olmadığını kontrol etmek için
                   == yerine  epuals() kullaniriz
                   sebebi ileride anlatılacak
                   == hem metne hem de stack memory'deki referansa bakar.
         */
        System.out.println("==========");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str6));

        // eger esitliği kontrol ederken cased sensitive olmasini sitemezseniz
        // Sadece esitliği kontrol ederken.

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str1.equalsIgnoreCase(str5));

    }
}
