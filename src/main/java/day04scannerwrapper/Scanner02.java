package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
     //Ornek : Kullanicidan adresini aliniz ve ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");

        //nextLine() method u kullanicidan cok kelimeli String almak icin kullanilir.
       String adres = input.nextLine();

        System.out.println(adres);


    }
}
