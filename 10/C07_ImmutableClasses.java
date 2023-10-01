package day10_passByValue_Immutable_dateTime;

public class C07_ImmutableClasses {
    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str);

        System.out.println(str.toUpperCase());
        //Herhangi bir atama olmadığı için java referansın point ettiği heapteki variable üzerinden degisiklik yapar,
        //yazdırır ama atama olmadıgı icin variable ilk atamasına geri doner



        str = str.substring(0,4);
        System.out.println(str); // Java
        // atama yapıdılktan sonra yazdırıldıgında heap memoryde yeni bir obje olusur, referans yeni olusan o objeyi point etmeye baslar
        // yazdırdıgımızda java referansın point ettigi yeni objeye bakar ve onu yazdırır, eski obje boslukta sallanır
        str = str.toUpperCase();
        System.out.println(str);
        //ustteki ile aynı durum


        //eski objeler ise boslukta sallanır ve garbage collector onları toplayana kadar orada dururlar.herhangi bir islevleri yoktur


        for (int i = 0; i <= 100 ; i++) {
            str += ".";
        }
        System.out.println(str);
    }
}
