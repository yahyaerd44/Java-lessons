package day01variables;

import java.util.Arrays;

public class Variables01 {

    public static void main(String[] args) {

        //java bu satirlari okumaz, kendimize ve başkalarına aciklama satiridir
        /*
        java bu satirlari da okumaz
         */

        //Variable nasil olusturulur ?
        //Data type + variable name + Assigment Operator (atama operatoru)+ Variable degeri+ noktali virgul
        int                age                  =                                13              ;
        //java cumlesi => statement
        //Variable Declaration (yukarıdaki Data type + variable name kısmına denir)
        //Dil bilgisindeki nokta ne ise javadaki ;  aynı seydir, yani statement in bittigini gosterir.
        //Eger variable declaration yapar,Assigment yapmazsaniz java kendi default degerlerini koyar
        //Default deger sayilar icin sifirdir.
        //java da ''='' assigment operator dir. ve java bu operatoru gordugu zaman once sag tarafı calistirir.
        //ve sagdaki degeri alir soldaki kutuya koyar.
        // java da esittir demek ''=='' matematikte ''='' ,  Javada ''==''

        /*
        Javada temel iki tip data vardir.
        1)primitive data type:
        char , boolean,byte, short, int, long, float, double
        2)non-primitive data type:
        String
         */

        //Ornek 1 : Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz

        String ogrenciAdi = "Ali Can" ;

        /*String lere verilen degerler daima cift tirnak icinde yazılmalidir.
        //String ler icin "default value" (varsayilan deger) "null" dir

        //String bir variable olusturdugumuzda cogu zaman ona bir deger atariz.Atama yapmazsak,
         java o variable ye varsayilan deger olarak null koyar.
         -null demek 0 (sıfır) demek degildir, 0 da coding te bir degerdir,null hiclik demektir.
         icinde variable ya da method bulunmauan bos bir obje demektir.
         {}==> eleman yok {0}==> elemani sifir

         */

        //char data type
        //Tek karakterler icin kullanilir.Sayi , Sembol ya da harf farketmez.
        //ornegin ==> A,x, ?,5,....
        //Ornek 2 : char data tipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz ?

        char isminIlkHarfi = 'A' ;

        //Note: char data type inda degerler daima tek tirnak icinde yazilmalidir.

        //boolean data type :
        //boolean lar sadece iki farkli deger alabilir ; true(dogru) veya false(yanlis)
        // o yuzden isimlendirme yapilirken ingilizce olarak mi ? soru eki anlaminda basina is konulur.
        // Ornek 3: boolean data tipinde emekli misin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean emekliMisin = false ;

        //byte data type :
        //tam sayilar icin kullanilir. hafizada 1 byte yer kaplar.
        //byte : -128 den + 127 ye (dahil) kadar tamsayi degerleri icin kullanilir.
        //Ornek 4 : byte data tipinde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 18 ;

        //short data type :
        //tam sayilar icin kullanilir. hafizada 2 byte yer kaplar.
        //short : -32768 den + 32767 ye (dahil) kadar tamsayi degerleri icin kullanilir.


        //Ornek 5 : Site nufusu icin bir variable olusturunuz ve bir deger atayiniz.
        short siteNusufu = 1300 ;

        //int data type :
        //tam sayilar icin kullanilir. hafizada 4 byte yer kaplar.
        //int : -2,174,483,648 den +2,147,483,647 ye (dahil) kadar tamsayi degerleri icin kullanilir.

        //Ornek 6 : Ulke nufuslari icin bir variable olusturun ve deger atamasi yapiniz.

        int ulkeNufusu = 131313131 ;

        //long data type :
        //tam sayilar icin kullanilir. hafizada 8 byte yer kaplar.
        //long : -9,223,372,036,854,775,808 den +9,223,372,036,854,775,807 ye (dahil) kadar tamsayi degerleri icin kullanilir.

     //Ornek 7 : Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        //NOTE :Bir deger long ise sonuna "L"(tavsiye edilir) veya "l" konulur.
        long cellNumberInHumanBody = 1245465465465465465L;
        //NOTE:Eger long a atadıgınız deger int lerin aralıgında ise sonuna "L" koymayan gerek yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder
        long gunesinAgırlıgı= 1234564654;

        //float data type : 4 byte yer kaplar
        //float virgullu sayilar(Decimal Number=>ondalikli sayilar) icin kullanılır.(fiyatlandırmalar -12.99)

        //Ornek 8 :Gomlek ve ayakkabi fiyatları icin iki tane variable olusturun.

        //Note : Java ondalikli sayilari otomatik olarak "double" kabul eder.
        //Siz data type ini float yazarsaniz hata alirsiniz,float olmasinda israr ediyorsaniz sonuna "F" ,"f" koymalisiniz.
        float GomlekFiyati= 32.99F;
        float AyakkabiFiyati=42.99f;

        //double data type : 8 byte yer kaplar
        //ondalikli kismi icin daha fazla rakam alabilir. Hucre agırlıgı gibi bilimsel calısmalarda kullanilabilir.

        //Ornek 9 : Hucre agirligi ve Amip in agirligi icin iki tane variable olusturunuz.

        double hucreAgirligi =0.000000000013;
        double Amip          =0.000000000003;
        //Ornek 10 : Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdiriniz.
        byte ogrenciNotlariBir = 85 ;
        byte ogrenciNotlariİki =90 ;
      //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar.
        //System.out.print();ekrana yazdirir ve pointer i ayni satirda tutar.
        System.out.println(ogrenciNotlariBir+ogrenciNotlariİki);

     }

}
