package day10ifstatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
        asagidaki tabloya gore yazdiran kodu olusturunuz
        0-4 ==> bebek
        5-12 ==> cocuk
        13-20  ==> genc
        21-30  ==> yetiskin
        30 ustu  ==> Tanimlanmamis
        Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz.
      */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Gecerli bir yas giriniz");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanımlanmamis yas..");
        }
        /*
        Homework
        1) Kullanicidan alinan password "pwd123!" oldugunuda verilen password un dogru olup olmadigini kotrol eden ve
        kullaniciya uygun mesaj veren kodu yaziniz


        2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz

        3) Ay sayisini verdiginizde ay ismini veren kodu yaziniz
        1==> January , 2==>February
         */
        Scanner inp =new Scanner(System.in);
        System.out.println("Lutfen sifresinizi giriniz..");
        String sifre = "wd123";
        String sifegir =inp.next();
        if (sifegir.equals(sifre)){
            System.out.println("Sifre dogru");
        }else {
            System.out.println("sifre yanlıs..");
        }
    }
}
