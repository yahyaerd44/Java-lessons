package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Ornek : Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz..");
        double birinciSayi = input.nextDouble();
        double ikinciSayi = input.nextDouble();
        System.out.println(birinciSayi +ikinciSayi);
        System.out.println(birinciSayi-ikinciSayi);
        System.out.println(birinciSayi*ikinciSayi);
        System.out.println(birinciSayi/ikinciSayi);



    }
}
