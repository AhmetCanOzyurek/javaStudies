package day04__Stringmanupilation_ForLoops;

public class C17_UcgenBastirma {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <i + 1 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // sola yatık ucgen

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // sağa yatık

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 10; j >= i  ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
