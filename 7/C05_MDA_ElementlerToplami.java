package day07_ArrayiListeyeCevirme;

public class C05_MDA_ElementlerToplami {
    public static void main(String[] args) {
        int[][] arr= {{2,4,6},{1,2,3,4},{1,6},{5}};

        //MDA'deki tum sayilarin toplamini yazdirin
        int toplam =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                //System.out.print(arr[i][j]+ " "); // tum elementlerin yazdirilmasi
                toplam += arr[i][j];
            }
        }
        System.out.println("tum elementlerin toplami : "+toplam);
    }
}