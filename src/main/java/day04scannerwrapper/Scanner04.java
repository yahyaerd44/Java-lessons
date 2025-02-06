package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Ornek : Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz ====>kisa kenar * uzun kenar
        //b)Cevresini hesaplayiniz ==== > 2*kisa kenar + 2*uzun kenar

        Scanner input= new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz..");
        double kisaKenar= input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz..");
       double uzunKenar= input.nextDouble();

        System.out.println(kisaKenar*uzunKenar);
        System.out.println(2*kisaKenar+2*uzunKenar);

    }
}
