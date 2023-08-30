package day03_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class C02_MevsimYazdir {
    public static void main(String[] args) {
        //sour 2-Kullanıcıdan numarasını alin, o ayin mevsimini yazdırın.

        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen ay numarasini giriniz");
        int ayNo= scanner.nextInt();
        switch(ayNo){ //switch statement'da switch parantezinde long double, float, ve boolean kullanılamaz
            //switch statement'da switch parantezinde yazilan degere uygun case calisir ve break gorunceye veya switch cse bitinceye kadar calismaya devam eder.
            //break komutunu her caseden sonra kullanmak zorunda değiliz. ancak bu kodun break gorunceye kadar devam eder.
            case 12:
            case 1 :
            case 2 :
                System.out.println("kıs");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Ilk bahar");
                break;
            case 6 :
            case 7:
            case 8 :
                System.out.println("yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("son bahar");
                break;
            default:
                System.out.println("Yanlis ay numarasi girdiniz");



        }
    }
}
