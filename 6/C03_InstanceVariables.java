package day06_scope_arrays;

public class C03_InstanceVariables {
    static int sayiStatic = 20; //seçilmiş ırkı her yerde kullanabilirim.
    int sayiInstance = 30; //sıçılmışları kullanmam için onlara yardım etmem lazım. onlara işçi vizesi vermem gerekir.

    public static void main(String[] args) {
        System.out.println(sayiStatic);

        C03_InstanceVariables obj = new C03_InstanceVariables();
        obj.sayiInstance = 58;
        System.out.println(obj.sayiInstance);


    }//main sonu

    public static void method1(){
        System.out.println(sayiStatic);
        //Instance variable'ları kullanmam icin obje olusturmam gerekir. İsçi vizesi vermem gerekir var.

        C03_InstanceVariables obj = new C03_InstanceVariables();
        System.out.println(obj.sayiInstance); //30
        //obj.sayiInstance

    }

    public void method2(){
        System.out.println(sayiStatic);

        System.out.println(sayiInstance);// method static (seçilmiş değil sıçılmış olduğu) olmadığı için burada static olmayan variable'ları kullanabiliyorum.
    }



}//Class sonu
