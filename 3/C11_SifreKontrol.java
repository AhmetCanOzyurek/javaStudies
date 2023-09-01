package day03_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class C11_SifreKontrol {
    public static void main(String[] args) {
        /*soru : kullanicidan bir mail alin
                 - mail @ içermiyorsa "gecersiz mail"
                 - mail @gmail.com icermiyorsa " mail gmail olmalı"
                 - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin
                 bunlar bağlanılı mı değil mi bakmamız lazım.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String mail = scanner.nextLine();

        if(!mail.contains("@")){//içermiyorsa demek : if not
            System.out.println("gecersiz mail");
        }
        if(!mail.contains("@gmail.com")){
            System.out.println("mail gmail olmalı");
        }
        if (!mail.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }
    }
}
