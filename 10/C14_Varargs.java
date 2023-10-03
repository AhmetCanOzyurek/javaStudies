package day10_passByValue_Immutable_dateTime;

public class C14_Varargs {
    public static void main(String[] args) {


toplama(3,6,7);
toplama (3,6,7,10,14);
toplama(3,6,7,10,14,20);
        toplama(3,6,7,10,14,20,13);
        toplama(3,6,7,10,14,20,15,156);
        toplama(3,6,7,10,14,20,456,15,325,465);
/*
int .. int olarak istendigi kadar degisken alabilen
ve array altyapisini kullanan varargs tanimlayicisidir

 */
    }
    private  static void toplama ( int... sayilar){
        // sayilar yollanan tum argumentleri olan bir arraydir

        int elementlerToplami = 0;
        for (int i = 0; i < sayilar.length ; i++) {
            elementlerToplami += sayilar[i];
        }

        System.out.println("argument olarak girilen " + sayilar.length + " sayiin toplami: " + elementlerToplami );
    }
}
