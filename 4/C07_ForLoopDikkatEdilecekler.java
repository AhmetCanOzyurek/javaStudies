package day04__Stringmanupilation_ForLoops;

public class C07_ForLoopDikkatEdilecekler {
    public static void main(String[] args) {
        //for loop ilk calistiginda (ilk dongu) artirma/azaltma islemi yapmaz
        //ikinci donguden itibaren devreye girer.

        for (int i = 0;i <= 10; i++){
            System.out.print(i+ " ");
        }

        //ilk deger icin sart false oluyorsa
        //for loop calisi ama loop body'si hic devreye giremeyeceği icin
        //loop body'sindeki yapilanlari GOREMEYİZ

        for (int i = 20; i<15; i++){
            System.out.print(i + " ");
        }

        //artis azalis devam ederken
        // hicbir zaman sart false olmuyorsa
        //SONSUZ LOOPA NEDEN OLURUZ : DORMAMUU

       /* for(int i = 0; i<10;i--){
            System.out.print(i + " ");
        }
        */
    }
}
