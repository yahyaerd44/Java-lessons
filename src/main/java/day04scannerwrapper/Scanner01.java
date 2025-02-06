package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

// Ornek : Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz

// 1.Adim :Scanner class tan bir object olustur
        Scanner input = new Scanner(System.in);

        //2.adim : kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("ilk ismini giriniz...");

        //3.adim :Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
        //next () methodu kullanicidan tek kelimelik string almak icin kullanilir.
       String birinciAdi= input.next();
        System.out.println("Soy isminizi giriniz...");
       String soyİsim= input.next();
        System.out.println(birinciAdi+" "+soyİsim);


    }


}
