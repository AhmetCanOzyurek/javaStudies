package day02_operatorler;

public class C12_TERNARY {
    public static void main(String[] args) { //basit işlemlerde kolaylık sağlar ama komplekslere gücü yetmez.
        //basit if else işlemlerinde tercih edilebilir.
        int sayi = -10;

        //eger verilen sayi 2'nin katı ise sayinin 2 katini yazdirin.
        //2'nii kati degilse 5 fazlasını yazdırın.
        System.out.println(sayi % 2== 0 ? sayi*2 : sayi+5);

     sayi = sayi > 0 ? sayi*3:sayi+20;

        System.out.println(sayi);


        //ternary bize sonuç dondurduğu için
        // ya direk yazddırmalıyız veya
        // bir degiskene atamalıyız.
        //sadece ternary'i yazarsak java hata verir.

        //verilen sayi 5 ile bolunuyorsa sayiyi 5 ile carpin
        //5 ile bolunemiyorsa sayiyi 5'in katı değil yazdırın.
        // ternary ile bunu yapamazsınız.
    }
}
