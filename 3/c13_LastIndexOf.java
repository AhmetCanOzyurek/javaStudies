package day03_SwitchStatements_StringManipulations;

public class c13_LastIndexOf {//aramaya sondan başlar
    public static void main(String[] args) {
        /*soru2  kullanıcıdan bir string ve aranacak metin alın
                aranan metnin stirng icerisinde kullanımını kontrol ederek asagidaki cumlelerden uygun
                -string ar

         */
        String str = "Java cok guzel, ben Java calismayi cok seviyorum";
        String arananMetin = "cok";

        int ilkİndex = str.indexOf(arananMetin);
        int sonİndex = str.lastIndexOf(arananMetin);

        if (sonİndex == -1){
            System.out.println("String aranan metni icermiyor");
        }else if(ilkİndex == sonİndex){
            System.out.println("Aranan metin strign de sadece bir kere kullanılmış");
        }else{
            System.out.println("aranan metin stringde sadece birden fazla kullanılmış");
        }
    }
}
