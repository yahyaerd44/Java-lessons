package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {//Nested : ic ice gecmis demek.inner icteki .outer dıstaki demek
    public static void main(String[] args) {
        /* Example 1: Kullanicidan 3 tane sayi aliniz.
        Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
        Eger ucgen ise "eskenar" ucgen olma durumunu kontrol ediniz.
        INFO :
        Ucgen olma sarti :herhangi iki kenar toplami ucuncu kenardan buyuk olmali
                          herhangi iki kenar farki ucuncu kenardan kucuk olmali
        a+b>c>|a-b|
        a+c>b>|a-c|
        b+c>a>|b-c|
        a=b=c ise eskenar ucgen
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz..");

      double a = Math.abs(input.nextDouble());
      double b = Math.abs(input.nextDouble());
      double c = Math.abs(input.nextDouble());

      boolean ucgenmi =  (a+b>c && c>Math.abs(a-b)) &&  // a+b>c>|a-b|)==>matematikte bu sekilde yazılır kod icine yazdıgımız java dilinde.
                         (a+c>b && b>Math.abs(a-c)) &&  // a+c>b>|a-c|
                         (b+c>b && a>Math.abs(b-c));    // b+c>a>|b-c|

      if (ucgenmi) {
          if (a==b && b==c && a==c){
              System.out.println("ucgendir hem de eskenar ucgendir");
          }else {
              System.out.println("Ucgendir ama eskenar degil..");
          }
      }else {
          System.out.println("Bu bir ucgen degildir");
      }
    }
}
