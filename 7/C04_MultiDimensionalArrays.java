package day07_ArrayiListeyeCevirme;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr= {{2,4,6},{1,2,3,4},{1,6},{5}};
        System.out.println(arr.length);//4

        System.out.println(arr[1].length);// arr array'inin icindeki 2. array'in sayisi

        System.out.println(arr[3]); //[I@511d50c0 referans kodu

        System.out.println(arr[0][2]);//6
        System.out.println(arr[1][2]);//3

        //icice yazdirmak icin Arrays.deepToString şeklinde yazdırmamız lazım.
    }
}
