package day07_ArrayiListeyeCevirme;

public class C07_MDA_CiftSayilarinToplami {
    public static void main(String[] args) {
        /*
        soru 1- Verilen 2 katli bir array'de bulunan cift sayilari toplayip,
        sonucu yazdiran bir method olusturun.
         */

        int[][] arr= {{2,4,6},{1,2,3,4},{1,6},{5}};
        ciftSayilarinToplami(arr); //Array'deki cift sayilarin toplami : 24

    }
    public static void ciftSayilarinToplami(int[][] arr){
        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] % 2 == 0){
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("Array'deki cift sayilarimizin toplami : " + toplam);
    }
}
