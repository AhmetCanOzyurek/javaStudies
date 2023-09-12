package day06_scope_arrays;

public class C09_PozitifElementlerinToplamı {
    public static void main(String[] args) {
        int[] arr = {3,1,-7,4,-9};

        System.out.println(pozitifSayiToplami(arr)); //methodlarda arraylari yazdirirken ne döndürdüğüne bakarak nasıl yazdiracağina karar verebilirsin.

    }
    public static int pozitifSayiToplami (int[] arr){ // dönüş türünü belirlerken döndüreceğimiz variable'in ne olduğuna bakmamız gerekir. ben burda public static int [] olarak yazdım ve toplam'ı döndürmeye çaliştim . olmadi. array işaretini silince oldu.
        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 ){
                toplam += arr[i];
            }
        }
       return toplam;
    }
}
