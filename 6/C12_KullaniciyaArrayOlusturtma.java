package day06_scope_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {
        int[] arr = intArrayOlustur();
        System.out.println(Arrays.toString(arr));
    }
    public static int[] intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olusturulacak array'in uzunlugunu girin");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];

        System.out.println("lutfen array için element degeri giriniz");

        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
