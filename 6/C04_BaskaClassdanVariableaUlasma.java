package day06_scope_arrays;

public class C04_BaskaClassdanVariableaUlasma {
    public static void main(String[] args) {
        System.out.println(C03_InstanceVariables.sayiStatic);
        C03_InstanceVariables.sayiStatic = 98;
        System.out.println(C03_InstanceVariables.sayiStatic);

        ////////SCOPE : bir variable'a nereden ulaşılabileceğine
        //parametreler de local variable'dır.

        //deger atanmamış (null) variable'lara dikkat et.

        //obje deklare edilmesi de variable atamasıdır.

        //static variablelara objelerle de ulasabiliriz.

    }
}
