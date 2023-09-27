package day09_Constructors_StaticKeyword;

public class C07_StaticBlocks {
    C07_StaticBlocks(){
        System.out.println("cons calisti");
    }
    static {
        // class calistiginda static meblocklar her seyden once calisir.
        System.out.println("static1 block calisti.");
    }
    static {
        System.out.println("static 2 block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        //cons calimsadan once static olmayan blocklar calisir
        // sonra cons calisir.

        // kullanim alanlari main method calismadan once yapılması gerekenler varsa static blocklar

        // obje calismadan once yapilmasii gerekenler varsa static olmayan blocklar kullanilabilir.
        C07_StaticBlocks obj = new C07_StaticBlocks();
    }

    /*
    static bloklar main methottan once calisir.

    kendi iclerinde sıraları nasıl ise o sırayla calisir
     */


    {
        System.out.println("static olmayan block1 calisti");
    }

    {
        System.out.println("stattic olmayan block2 calisti");
    }


}
