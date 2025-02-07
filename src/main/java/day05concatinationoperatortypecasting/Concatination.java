package day05concatinationoperatortypecasting;

public class Concatination {
    //Birlestirmek demek

    public static void main(String[] args) {

        //Ornek 1 : Bir string ve iki int variable olusturun. String degeri ile int lerin toplamini console a yazdirin.

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//elma1011
        System.out.println(s + (a + b));//elma21 (oncelik parantez-islem onceliklerine dikkat et)
        System.out.println(s + a * b);//elma110(oncelik carpma islemi)
        System.out.println(a + b + s);//21elma(java soldan saga okur artılar esit o yuzden toplar)
        System.out.println(a + s + b);//10elma11

        //java da "+" sembolu iki sayi arasında kullanilirsa "toplama islemi" olur
        //java da "+" sombolu iki string arasında veya bir string ve bir sayi arasinda kullanilirsa concatination(birlestirme) islemi olur
        //concatination islemi birlestirme yapar.
        //Note : Concatination islemlerinde java matematikte ki islem onceligini kurallarini kullanir.

        /*
        islem oncelikleri ;
        1)Once uslu sayilar
        2)Parantez ici islemler yapilir
        3)Carpma ve bolme islemleri yapilir
        4)Toplama ve cikarma islemleri yapilir.
        5)Aynı oncelikli olanlarda soldan saga islem baslanir.
        */

        //Ornek 2 : Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz.

        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt + shoes);//23005200

        // valueOf --> String degerleri İnteger a  cevirir.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3 : Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        String tv="$1100";
        String radio = "$300";
        System.out.println(tv+radio);//$1100$300

       int topalam= Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(topalam);//hata verir
        //Note : valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir.
        //Eger valueOf() methodu kullanilirken String in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //bu tarz hataları duzeltmeyi ilerleyen derslerde ogrenecegiz.
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.


    }


}
