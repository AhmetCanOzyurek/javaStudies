package day10_passByValue_Immutable_dateTime;

public class C08_ImmutableClass {
 public static void main(String[] args) {

     /*
     Java'da bir String olusturulurken
     bugune kadar yaptigimiz gibi basit yontem kullaniliyorsa (String str = "abc";)
     JAva StringPool kullanir, ayni degere sahip ve basit seiklde olusturulmus String'ler icin ayni referansi kullanir.
     Boylece == ile karsilastirildiginda referans ve metin ayni oldugundan true verir.
      */

            String str1= "Not"; // SP
            String str2= "N";
            String str3= "ot";
            String str4= "Not"; //SP
            String str5 =new String("Not"); //Sp degil
            String str6 = str2 + str3; //SP deil
            String str7 = "N" +"ot"; //
            String str8 = str2.concat(str3);

            System.out.println(str1 == str4);// ture
            System.out.println(str1 == str5);// false
            System.out.println(str1 == str6); // false
            System.out.println(str1 == str7); // true
            System.out.println(str1 == str8);//false
     System.out.println(str1 == "Not"); // true


     System.out.println("---------------------------------");

     System.out.println(str1.equals(str4));
     System.out.println(str1.equals(str5));
     System.out.println(str1.equals(str6));
     System.out.println(str1.equals(str7));
     System.out.println(str1.equals(str8));
     System.out.println(str1.equals("Not"));
       /* *//*
        SIMDILIk : Java'da metinsel ifadelerin ayni olup olmadığını kontrol etmek için
                   == yerine  epuals() kullaniriz
                   sebebi ileride anlatılacak
                   == hem metne hem de stack memory'deki referansa bakar.
         *//*
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
        */
        }


}
