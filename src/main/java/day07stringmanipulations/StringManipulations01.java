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
                           Olumsuzlari:
              8)kucuk harflerden farkli tum characterler =>[^a-z] (^ isareti haric hepsi demek)
              9)Tum harflerden farkli tum characterler   =>[^a-zA-Z]
              10)sadece space karakteri ==>\\s
                space karakteri haric ==>\\S
                sadece rakamlar ==>\\d
                rakamlar haric\\D
          */
        //Ornek 7:"t" String indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz.
        //regexleri string formatında gonder
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...
        // replacement : degistirmek istedigin sey demek
        // Ornek 2: "t" Stringindeki tum rakamlari ve harfleri "!" e ceviriniz

        String t2 =t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Ornek 3:"t" Stringindeki tum sesli ve harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Ornek 4:"t" Stringindeki kucuk harfler dısındaki  tum karakterleri "<>"  ceviriniz.
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Ornek 5:"t" Stringindeki tum harfler dısındaki tum karakterleri "+" ceviriniz.
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Ornek 6:"t" Stringindeki speace ler disindaki tum characterleri "?" e ceviriniz.
       String t6 = t.replaceAll("[^ ]","?");// \\S sekilde de kullanılır
        System.out.println(t6);//??? ?? ??????????????

        //Ornek :7"t" Stringindeki sesli harfler dısındaki tum characterleri "&" e ceviriniz.

        String t7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&
    }
}
