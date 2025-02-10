package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String t = "Ali 13 yasindadir!...";

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions"(Regex)
        //Note:Bir grup datayi degistirmek icin replaceAll() kullanilir.
        //Note:Regex ifadesinde "^" isareti haric anlamına gelir.
        /*
                      Meshur Regex ler
              1)Tum rakamlar               ==>[0-9]
              2)Tum kucuk harfler          ==>[a-z]
              3)Tum buyuk harfler          ==>[A-Z]
              4)Tum kucuk ve buyuk harfler ==>[a-zA-Z]
              5)Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
              6)Tum noktalama isaretleri   ==>\\p{Punct}
              7)Tum sesli harfler          ==>[aeiouAEIOU]
              8)Tum x,q,w harfleri         ==>[xqw]
              9)Tum a,b,c harfleri         ==>[abc]

                                Olumsuzlari:
              10)kucuk harflerden farkli tum characterler =>[^a-z] (^ isareti haric hepsi demek)
              11)Tum harflerden farkli tum characterler   =>[^a-zA-Z]
          */
        //Ornek 7:"t" String indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz.
        //regexleri string formatında gonder
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...
        // replacement : degistirmek istedigin sey demek
    }
}
