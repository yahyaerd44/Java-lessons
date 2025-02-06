package day03methodobjectcreationscanner;

//java nın util kutuphanesinden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
//1.Adim Scanner Class tan object olustur.
        //input==> Girdi demek
        Scanner input = new Scanner(System.in);
//2.adim kullaniciya ne istediginixe dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz");
//3.adim Uygum methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz.
       byte age= input.nextByte();
        System.out.println("age = " + age);
    }

}
