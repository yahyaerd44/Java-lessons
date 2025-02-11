package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
    /*
     Ornek:
    Asagıdaki kurallara gore kullanicinin girdigi password u kontrol ediniz
    1) En az 8 charcter olsun
    2) Space characteri passwordde olmasin
    3) En az bir buyuk harf olsun
    4) En az bir kucuk harf olsun
    5) En az bir rakam olsun
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();//coklu stringleri icin nextLine

        //  1) En az 8 charcter olsun
        boolean first = pwd.length() > 7;//karakter sayisini sayar
        System.out.println("first " + first);//En az 8 karakter var mi

        //2) Space characteri passwordde olmasin
        boolean second = !pwd.contains(" ");// ! i(not) bu isaret icermesin anlamı katar.
        // contains string kavanozuna gidip bakar icersinde yazdıgımız karakter var mı yok mu diye kontrol eder
        //Burada "" anlamı hıclık yani git bak space haric ne varsa sil demek
        System.out.println("second = " + second);

        //3) En az bir buyuk harf olsun
        // Note : Buyuk harf olmayanlari sil
        // kalan character sayisina bak
        // character sayisi sifir ise buyuk harf yok demektir
        // sifirdan buyuk ise buyuk harf var demektir
        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //Methodlari ayni satirda yanyana kullanmaya method chain(ceyn) denir
        System.out.println("third = " + third);

        // 4) En az bir kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("d = " + fourth);

        //5) En az bir rakam olsun
        boolean fifth = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("e = " + fifth);

        System.out.println(("Password gecerli mi?  "+(first && second && third && fourth && fifth)));

    }
}
