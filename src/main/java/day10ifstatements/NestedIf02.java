package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
      /*
      Example 2: Kullanicidan bir ucgenin kenar uzunluklarini aliniz
      uc kenari birbirine esit ise "Eskenar ucgen" yazdiriniz
      Sadece iki kenar uzuklugu birbirine esit ise "ikizkenar ucgen"
      Tum kenarlari birbirinden farkli ise "Cesitkenar ucgen" yazdiriniz
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz..");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) &&  // a+b>c>|a-b|)==>matematikte bu sekilde yazılır kod icine yazdıgımız java dilinde.
                (a + c > b && b > Math.abs(a - c)) &&  // a+c>b>|a-c|
                (b + c > b && a > Math.abs(b - c));    // b+c>a>|b-c|

        if (a<=0 || b<=0 || c <=0){
            System.out.println("Gecerli kenar uzunlugu giriniz.");
        }else if (ucgenmi) {
            if (a==b && b==c && a==c){
                System.out.println("Eskenar");

        }else if(a==b || b==c || a==c) {
                System.out.println("Ikizkenar");

            }else {
                System.out.println("Cesitkenar");
            }


            }else {
            System.out.println("Ucgen degildir");

        }
    }
}
