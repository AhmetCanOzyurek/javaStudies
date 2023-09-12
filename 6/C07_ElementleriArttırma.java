package day06_scope_arrays;

import java.util.Arrays;

public class C07_ElementleriArttırma {
    public static void main(String[] args) {
                //verilen bir int array'in tüm elemanlarini 2 artirip bize donduren bir metho olusturun
        //        eski array'i yeni haliyle kaydedin.
            int[] arr= {3,6,9};
        System.out.println("Array'in ilk hali "+Arrays.toString(arr));
            arr = elementArtır(arr);
        System.out.println("Array'in son hali " + Arrays.toString(arr));



    }//main sonu
    public static int[] elementArtır(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] += 2;
        }
        return arr;
    }


}//class sonu
