package day05concatinationoperatortypecasting;

public class Operators {
    public static void main(String[] args) {

        /*
        1) + , - , * ,/ islemleri java da matematik te kullanildigi gibi kullanilir
            Note 1: int / int ==> int olur
            Note 2: double + int ==> double olur.
            Cunku java da matematiksel islemlerde farkli data typlari kullanilirsa sonuc her zaman buyuk data type inda olur

       2) Java da "Logical Operator" lar vardir.AND(&&) ve OR(||) islemleri "Logical Operator" lardir.
          i) AND(&&) isleminden true alabilmek icin her sey true olmalidir.
             AND(&&) islemi "perfectionist" tir
             AND isleminde bir tane bile false sonucu false yapar

           ii) OR(||) isleminde bir tame true sonucu true yapmaya yeter
               OR isleminde sonucun false olmasi icin her sey false olmalidir.
               OR islemi "polyanna" gibidir.

           iii) NOT operator (!) (degil) true olani false ,false olani true yapar.
                !true => false
                !false => true
                !!true => true

        3) Comparison(Karsilastirma) Operators
            <(kucuk),>(buyuk), <=(kucukesittir),>=(buyukesittir),==(esittir), != (esit degil)

            Note : Karsılastirma operatorlerini kullandiginizda KESİNLİKLE boolean(true veya false) alirsiniz.
            Note : Biz AND islemi icin && kullaniriz & kullanim da gecerlidir
            Farklari nedir ?
            "&&" kullanim ilk ifade "false"oldugunda digerlerini kotrol etmez,dolayisiyla hizli calisir.
            cunku AND isleminde ilk ifade false ise digerlerinin ne oldugunun bir onemi yoktur sonuc false olur
            "&" kullanim ilk ifade ne olursa olsun digerlerini kotrol eder dolayisiyla yavas calisir.
            Biz bu yuzden hep "&&" kullaniriz.
              */
        boolean  first =3<5;
        boolean  second=2+3!=5;
       boolean third =  2+3*5>19;
        System.out.println(first + "-"+second+"-"+third);//true-false
        System.out.println(first && second);//false
        System.out.println(first|| second ||third);//true



    }
}
