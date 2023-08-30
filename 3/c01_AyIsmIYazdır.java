package day03_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class c01_AyIsmIYazdır {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen yazdırmak istediğiniz ay isminin ilk harfini giriniz: ");
        char ilkHarf = scanner.next().toUpperCase().charAt(0);
        switch (ilkHarf){

            case 'O' :
                System.out.println("Ocak");
                break;
            case 'S' :
                System.out.println("Subat");
                break;
            case 'M' :
                System.out.println("Mart veya Mayis");
                break;
            case 'N' :
                System.out.println("Nisan");
                break;
            case 'H' :
                System.out.println("Haziran");
                break;
            case 'T' :
                System.out.println("Temmuz");
                break;
            case 'A' :
                System.out.println("Agustos veya Aralik");
                break;
            case 'E' :
                System.out.println("Eylul veya Ekim");
                break;
            case 'K' :
                System.out.println("Kasim");
                break;
            default:
                System.out.println("Gecersiz harf");

        }

    }
}
