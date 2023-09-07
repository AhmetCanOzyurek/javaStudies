package day04__Stringmanupilation_ForLoops;

public class C13_NestedForLoops {
    public static void main(String[] args) {
        // 1'den +'e kadar olan sayilari yanyana yazdirin
        //amelelik
        /*
        for (int i = 1; i <=4 ; i++) {
            System.out.println(i+ " ");
        }

        //alt satira 2 4 6 8
        for (int i = 1; i <=4 ; i++) {
            System.out.println(2*i+ " ");
        }

        //alt satira 3 6 9 12
        for (int i = 1; i <=4 ; i++) {
            System.out.println(3*i+ " ");
        }

        //alt satira 4 8 12 16
        for (int i = 1; i <=4 ; i++) {
            System.out.println(4*i+ " ");
        }
            */

        //asıl yazılımcı işi
        /*
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j * i + " " );
            }
            for (int k = 1; k <= 4 ; k++) {
                System.out.println("\n");
                break;
            }
        }
            */
        // java da dikdortgen veya ucgen biciminde sekil olusturmak için
        //nested for loop kullanılır.
        for (int i = 0; i <=4 ; i++) {//kac satir oldugunu kontrol eder
            for (int j = 0; j < i ; j++) {
                System.out.println("*");
            }
            for (int k = 0; k <i ; k++) {
                System.out.println(" ");
            }
            System.out.println("\n");
        }
    }
}
