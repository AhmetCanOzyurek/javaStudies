package day06_scope_arrays;

public class C010_ElemanSayma {
    public static void main(String[] args) {
        int[] arr = {3,6,4,2,4,3,6,9,7,1,3,5,6,8,9,0};
            int arananSayi = 5;

        istenenElemanSayisiniBulma(arr,arananSayi);
    }

    public static void  istenenElemanSayisiniBulma(int[]arr,int arananSayi){
        int sayac =0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] == arananSayi){
                sayac++;
            }
        }

        if(sayac == 0) System.out.println("Aranan eleman array'da yok");
        else System.out.println("Aranan eleman "+ sayac + " kere kullanılmıs");
    }
}
