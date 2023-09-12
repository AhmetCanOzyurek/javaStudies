package day06_scope_arrays;

public class C05_ARRAYS {
    public static void main(String[] args) {
        int[] a = {2,44,5,2,1};

        System.out.println(a[1]); //44

        // ikinci indeX'deki elemanın degerini 20 yapin

        a[2] = 20;

        //tum elemenleri yazdirin.

        for (int i = 0; i <=4 ; i++) {
            System.out.println(a[i] + " ");

            ///bir ARRAY olustururken 2 sey deklare edilmelidir.
            /*
            1 _ icine konulacak elementlerin data turu


            2- icine kac element konulacagı.
             */

        }
    }
}
