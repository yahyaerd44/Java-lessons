package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve
        // son iki basamagindaki rakamlarin toplamini yazdiran kodu yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz..");
       int sayi= input.nextInt();

         //son rakamini al
        int birlerBasamagi= sayi%10;
        //sayiyi kucult
        sayi= sayi/10;

        //sondan ikinci rakami al
        int onlarBasamagi= sayi%10;
        //saiyi kucult
        sayi = sayi/10;

        //sondan Ucuncu rakami al
        int yuzlerBasamagi= sayi%10;
        //sayiyi kucult
        sayi=sayi/10;

        //sondan dorduncu rakami al
        int binlerBasamagi=sayi%10;
        //sayiyi kucult
        sayi=sayi/10;

        //sondan besinci rakami al
        int onbinlerBasamagi=sayi%10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(onbinlerBasamagi+binlerBasamagi+onlarBasamagi+birlerBasamagi);


        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz.
        // % ==> modulus(macılıs) operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        //Bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar.
        //java yuvarlama yapmaz,ondalik kismi iptal eder.
        //dolayisiyla bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz



            //Homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        // ornegin ==> 3,5,7 icin ortalama (3+5+7)/3=5
        System.out.println("Lütfen üc tane sayi giriniz");

        input=new Scanner(System.in);
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
        System.out.println((a+b+c)/3);


        //2) kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        //ornegin 312 icin 3+1+2=6
        System.out.println("Lütfen üc basamakli sayi giriniz");
        input=new Scanner(System.in);
       int ucBasamakliSayi=input.nextInt();

       int sonBasamak= ucBasamakliSayi%10;
        ucBasamakliSayi=ucBasamakliSayi/10;

        int soniki=ucBasamakliSayi%10;
        ucBasamakliSayi=ucBasamakliSayi/10;

        int sonUc=ucBasamakliSayi%10;

        System.out.println(sonBasamak+soniki+sonUc);

    }
}
