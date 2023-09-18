package day08_ArrayLists_foreachLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArraydanTekrarlariSilme {
    public static void main(String[] args) {
        // verilen bir array'dan tekrar eden elemnetleri silip
        // array'i unique elementlerden olsuan bir hale donusturun.


        int[] arr = {2,25,89,56,65,48,12,4,5,5,6,7,4,5,7,8,5,6,78};

        List<Integer> list= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!list.contains(arr[i])){
             list.add(arr[i]);
            }
        }
        System.out.println(list);
        //array'de uzunluhu degistirmej çok zor oldugu icin
        // islemi bir list uzerinde yapip
        // en sonda yeniden array'e dondurelim.
        System.out.println("tekrarsiz liste: "+ list); //[2, 25, 4, 5, 6, 7, 8, 78]

        arr = new int[list.size()];

        System.out.println("arr'nin son hali: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        System.out.println("arr'nin son hali: " + Arrays.toString(arr));


    }
}
