package day04__Stringmanupilation_ForLoops;

public class C07_ForLoops {
    public static void main(String[] args) {
        //1'den 100'e kadar(dahil) olan sayilari yanyana yyazdirin

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }

        //100'den geriye dogru iki basamaklı sayiları yanyana yazdirin

        for (int i = 99; i >= 10; i--) {
            System.out.print(i + " ");
        }

        for (int i = 130; i <= 245; i++) {

            if (i % 7 == 0) {
                System.out.print(i + " ");
            }

        }

        // 70'den baslayarak 200'e kadar (dahil) 3'er 3'er artirarak yazdirin
        for(int i = 70; i <= 200; i+=3){
            System.out.print(i + " ");
        }

    }
}