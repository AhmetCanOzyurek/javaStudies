package day08_ArrayLists_foreachLoop;
import java.util.List;
import java.util.ArrayList;

public class C07_IstenmeyenElementleriSilme {
    public static void main(String[] args) {
        List<String > isimler = new ArrayList<>();

        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Cem");
        isimler.add("Gamze");

        // listede icinde e hraafi bulunan isimleri silin

        // silmek yerine silinmeyecek elementleri gecici bir lsiteye kaydedelim

        List<String> geciciList = new ArrayList<>();

        for (int i = 0; i <isimler.size() ; i++) {
            if(!isimler.get(i).contains("e")){
                geciciList.add(isimler.get(i));
            }
        }

        isimler = geciciList;
        System.out.println("atamadan sonra isimler: " + isimler);
        System.out.println("atamadan sonra gecici list: " + geciciList);

        // silme yerine silinmeyenleri kaydetme


    }
}
