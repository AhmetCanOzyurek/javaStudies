package day06_scope_arrays;

public class C01_LoopVariables {
    public static void main(String[] args) {
       String str="Java Candir";

        System.out.println(str);//Java Candir


        for (int i = 0; i <10 ; i++) {
            int sayi = i;

            System.out.println(i);
            System.out.println(sayi);
        }


        //loop icerisinde olusturulan variable'lar, loop disinda kullanilamaz.
    }//main sonu

/*
ek bir durum yok ise oluşturulan variablelar oluşturulduğu methodun içinde kullanilabilir sadece.
 */



    public static void method01(){
        String str = "Java güzeldir";
        System.out.println(str);

    }


}//class sonu
