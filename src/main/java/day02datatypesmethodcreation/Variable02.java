package day02datatypesmethodcreation;

public class Variable02 {
    /*
    Java da temelde 2 tip data vardir
    1)primitive data type:
    char,boolean,byte,short,int,long,float,double (8 tanedir)
    2)non-primitive data type:
    String
     */
/*
Note 1 : primitive data type typ'larini java olusturmustur, biz olusturmayiz
Note 2 :primitive data type'larini isimlerinde sadece kucuk harf kullanilir
Note 3 :primitive data type lar data type larına gore memory de farkli farkli yer kaplarlar
Note 4 :primitive data lar iclerinde SADECE sizin atadiginiz degeri barindirir.
 */
    /*
    Non-primitive data types:
    Ornek =>String....(sayisi sinirsizdır)
  * uretilen her bir class ayni zamanda bir non-primitive data type dir.
  * Bu yuzden non-primitive data type lar sinirsiz satidadir denilebilir
  * Non-primitive data typelarin isimleri buyuk harf ile baslar
  * Non-primitive ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir.

     */
    public static void main(String[] args) {
        //Ornek : Ulke ismi icin bir variable olusturun ve ekrana yazdirin

        String ulkeIsmi ="Turkiye";
        System.out.println(ulkeIsmi);
        /*
        Interview sorusu : "primitive" ve "non-primitive" data type lari arasindaki fark nedir ?
        1) "primitive"ler bizim atadıgimiz degeri icerir
        "non-primitive"ler bizim atadigimiz degeri ve mothod lari icerir.
        2) "primitive"ler kucuk harfle baslar, "non-primitive"ler buyuk harfle baslar.
        3)"primitive"leri java uretmistir ve 8 tanedir,
        "non-primitive"leri java ve developerlar uretebilir,sinirsiz sayidadir.
        4)"primitive"ler memory de data type larina gore sabit boyutta bellek  kullanir.
        "non-primitive"ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler.
         */

    }
}
