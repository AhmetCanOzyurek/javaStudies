package day08_ArrayLists_foreachLoop;

public class C08_ForeachLoop {
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,1,3,6,89,3};

        //array'deki tum elementlerin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }
        System.out.println("for loop ile elementlerin toplami: "+ toplam);

        //index'e bagımlı olmaksizin, tum elementleri bize getirir.

        toplam =0;


        //foreach loopa uc seyi soylememiz gerekir
        //1- hangi data turunde elementlerin gelecegi
        // 2- loopun  getirdigi elementi loop icinde hangi isimle kullanacağimiz
        // elementlerin getirilecegi java yapisi.

        for (int each : arr
             ) {
            toplam += each;
        }
        System.out.println("for-each loop ile toplam: " + toplam);

        //aralarındaki temel fark
        // for loop index bazlıdır
        // foreach index bazlı degildir.

    }
}
