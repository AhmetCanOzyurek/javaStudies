package day06_scope_arrays;

import java.util.Arrays;

public class C06_Length {

    public static void main(String[] args) {

        String str = "Java Java Java";

        System.out.println(str.length()); //14

        System.out.println(str.charAt(str.length()-1)); //  a // bana son elemanı yazdır. son harfi getir.

        int[] arr  = {4,1,7,9,3};
        System.out.println(arr.length); // 5

        //son elementi yazdirin

        System.out.println(arr[arr.length-1]);// 3

        //butun elemenleri yazdirin

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println(arr); //bu şekilde yazdırınca bize referans kodunu yazdırır. [I@511d50c0


         // hepsini yazdirmak istersek de
        System.out.println(Arrays.toString(arr)); //[4, 1, 7, 9, 3]
        //seklinde yazdiriyoruz

    }
}
