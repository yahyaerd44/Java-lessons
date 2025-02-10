package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    //Manipulations : Belirli teknikler,araclar,methodlar kullanarak bir halden baska bir hale cevirmek,degistirmek,guncellemek
    public static void main(String[] args) {

        //String bir non-primitive data type dir ve ayni zamanda bir classdir.

        String s = "Java is easy";

        //Ornek 1:"s" String indeki tum characterleri buyuk harf yapiniz
        //toUpperCase() : Buyuk harf yapar
        String sUpper = s.toUpperCase();

        System.out.println(sUpper);//JAVA İS EASY

        //Ornek 2:"s" String indeki tum characterleri kucuk harf yapiniz

        s = "Java is easy";

        String sLower = s.toLowerCase();//Kucuk harf yapar (Case burada harf anlamında kullanılır. to  e-a demek, lower kucuk demek)
        System.out.println(s);//Java is easy

        //Ornek 3 :"s" String indeki ilk characteri aliniz
        //index'ler her zaman 0 (sıfır) dan baslar.0 Birinci karakter demek, boslukta karakterdir(space)
        s = "Java is easy";
        char ilkKarakter = s.charAt(0);// ilk index i verir. charAt girdigimiz degere gore index ini verir.
        System.out.println(ilkKarakter);//J

        //Ornek 4: "s" Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz.

        s = "Java is easy";
        char secondChar = s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s
        System.out.println("" + secondChar + secondLastChar);

        //Ornek 5: "s" String inde kullanilan toplam character sayisini bulunuz.

        s = "Java is easy";
        //Length bize indexi 0 dan sayip vermez 1 den baslayıp verir.
        int sLenght = s.length();//Toplam karakter sayisini verir

        System.out.println(sLenght);//12

        //Ornek 6: "s" Stringindeki ilk dort characteri aliniz.
        //substring : alt string demek.Bir String in belirli bir kısmını alır.
        //substring(0,4)==>  ilk index dahil ,ikinci index dahil DEGİL(baslangıc indexi dahil, bitis indexi haric )
        String java = s.substring(0, 4);
        System.out.println(java);//Java

        //Ornek 7: "s" Stringindeki kelimesindeki "is" kelimesini aliniz
        String is = s.substring(5, 7);
        System.out.println(is);//is

        //Ornek 8:"s" Stringindeki kelimesindeki "easy" kelimesini aliniz
        String easy = s.substring(8, 12);
        System.out.println(easy);//easy

        //ikinci yol
        //Bir character den baslayip String in sonuna kadar almak isterseniz,ikinci index i yazmayiniz
        //substring(8,12): yerine substring(8); yazdik boylece baslangıc indexinden itibaren sonuna kadar aldik
        String sub = s.substring(8);
        System.out.println(sub);

        //Ornek 9 :"s" Stringindeki "money" kelimesinin var olup olmadıgını kontrol ediniz
        //isEXist: bulunuyor mu demek
        //contains : icermek demek.istedigimiz karakter String de  var mı yok mu diye kontrol eder
        boolean isExist = s.contains("money");//key sensitive dir.Yani java da buyuk-kucuk harf duyarlıdır.
        System.out.println(isExist);//false

        //Ornek 10:"s" Stringinin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //startsWith : Belirli bir harfle baslayip baslamadıgını kontrol eder.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Ornek 11:"s" Stringinin 6.characterden itibaren belli bir harfle baslayio baslamadıgını kontrol ediniz.
        //Asagıdaki kod sunu demek istiyor 5 tane atla sonra sana verdigim harfle baslıyor mu kontrol et.
        //soru 5 :5.index dahil olmak uzere "i" karakteri ile baslayip baslamadigini kontrol eden kodu yaziniz
       boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);//true



    }
}
