package day06_scope_arrays;

public class C11_EnUzunKelimeBulma {
    public static void main(String[] args) {
        String[] isimler = {"Arda","Gamze","Eyup","Cem","Reyyan"};
        enUzunEnKısaKelimeler(isimler);

    }
    public static void enUzunEnKısaKelimeler(String[] arr){

        String enUzunKelime = arr[0];
        String enKısaKelime= arr[1];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i].length() > enUzunKelime.length()){
                enUzunKelime = arr[i];
            }

            if(arr[i].length()< enKısaKelime.length()){
                enKısaKelime =arr[i];
            }
        }

        System.out.println("en kısa kelime "+ enKısaKelime);
        System.out.println("en uzun kelime "+ enUzunKelime);
    }
}
