package day10_passByValue_Immutable_dateTime;

public class C02_PassByValue {
    public static void main(String[] args) {
        //classda %10 , %20,% 50 indirim yapip, indirimli fiyati yazdiran
        // 3 tane method olusturalim
        // main method 'dan verilen fiyattaki urunu
        // indirimli olarak yazdirtin.
        double fiyat =200;
        // saticidan musteriye %10 indirimli satti
        indirim10(fiyat);

        indirim20(fiyat);

    }
    public static  void indirim10(double fiyat){
        fiyat  =90*fiyat/100;
        System.out.println("%10 indirimli fiyat: "+ fiyat);
    }
    public static  void indirim20(double fiyat){
        fiyat  =80*fiyat/100;
        System.out.println("%50 indirimli fiyat: "+ fiyat);
    }
    public static  void indirim50(double fiyat){
        fiyat  =50*fiyat/100;
        System.out.println("%50 indirimli fiyat: "+ fiyat);
    }

}
