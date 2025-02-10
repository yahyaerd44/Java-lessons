package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Ornek 1: "s" String inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);//true

        //Ornek 2:"s" String indeki "money" kelimesini "dollar" kelimesine ceviriniz
        //replace : istedigimiz spesifik karakteri yer degistirir.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar

        //Ornek 3 :"s" String indeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //Ornek 4 :"s" String indeki "a" kelimesini "*" kelimesine ceviriniz.(ister "" ister '' sekilde olur(tek karakter icin)
        String s3 = s.replace('a', '*');
        System.out.println(s3);//Le*rn J*v* e*rn money
        //Note : replace () methodunda coklu karakterler icin calisirsaniz mecbur cift tirnak kullanmaliyiz
        //Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        //Ya ikisi de cift tırnak olmalı ya da ikisi tek tırnak olmalıdir

        //Ornek 5:"s" String indeki "n" harflerini "xxx"  ceviriniz.
        String s4 = s.replace("n", "xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //Ornek 6:"s" String indeki tum "e" harflerini siliniz
        String s5 = s.replace("e", "");//silme de yapar
        System.out.println(s5);//Larn Java arn mony

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

     String t2 = t.replaceAll("\\p{Punct}","!");
        System.out.println(t2);



    }
}
