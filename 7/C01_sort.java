package day07_ArrayiListeyeCevirme;

import java.util.Arrays;

public class C01_sort {
    //verilen int bir array'da tekrar eden element olup olmadigini
    // true veya false olarak bize donduren bir method olusturun.
    public static void main(String[] args) {
        int[] arr = {3,1,6,8,0,1,4,2,3};
        System.out.println(tekrarVarmi(arr));
        int[] arr1={1,3,5,4,8,6};
        System.out.println(tekrarVarmi(arr1));
    }

    public static boolean tekrarVarmi(int[] arr){
        Arrays.sort(arr);
        boolean sonuc = false;
        for (int i = 0; i <arr.length - 1; i++) {
            if(arr[i] ==arr[i+1]){
                sonuc =true;
                break;
            }
        }
        return sonuc;
    }
}
