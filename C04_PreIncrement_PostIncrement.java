package day02_operatorler;

public class C04_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        //a nın değeri bir arttır sonra topla

        int a = 10;
        a ++;
        int b = a;

        System.out.println(""+a +" "+  b);
        //yukarısı yanlışşşşş, doğrusu

        int c = 10;

        int d = c;
        c++;
        System.out.println("" +c+" "+d);

        a = 10;
        b = ++a;
        System.out.println("" +b + " " + a);

        c =10;
        d = c++;
        System.out.println("" +c+" "+d); // arttırma va azaltma işlemlerini istersem önce (predecremen/preincremen), istersem sonra kullanırım (postdecremen/postincremen)



        b = ++a; // iki işlem var. ++ önce a'yı bir arttır sonra a'nın degerini b'ye ata.
        d = c++;  //iki işlem var: önce c'nin değerini d'ye ata sonra c'nın degerini arttır.

        int sayia= 10;
        System.out.println(sayia--); //önce sayıyı yazdır. sonra sayıyı bir azaltacak.
        System.out.println(sayia); //sayının değeri bir azakdığı için 9 yazılacak.

        sayia =20;
        System.out.println(--sayia); // önce sayıyı azalt, sonra sayıyı yazdır. 19.

        System.out.println(sayia); //19
        /*
        aslında arttırma işlemlerinin önce sonra olması tek işlem olarak fark etmiyor. ama farklı işlemlerle aynı anda yaptırmaya çalıştığımızda pre/post önceliğine dikkat etmemiz lazım.
         */
        //int c = b++ + a;// önce işlemi yap sonra b'yi arttır.



    }
}
