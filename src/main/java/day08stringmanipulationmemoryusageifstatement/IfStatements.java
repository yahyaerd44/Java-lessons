package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {
        //if statements
        //bazi kodlari bazi sartlara gore aktive edebilmek icin if statements kullanilir
        //if eger demek ==> if cumlesi

        //if you study hard,you will learn Java  (eger sıkı calısırsaniz,Java'yı öğreneceksiniz)==>english

        /*
        if (if you study hard){
            you will learn Java ==> java
        }
        */

        //Ornek 1: Sayi pozitif ise ekrana pozitif yazdirin

        int num = -13;
        if (num > 0) {
            System.out.println(num + "==> pozitiftir");//13==> pozitiftir

            // Ornek 2: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin
            // -1<n<10(yanlıs olan) ==> n>-1 && n<10 (dogru olan)
        }
        int n = 5;
        if (n>-1 && n<10) {
            System.out.println("Rakam");

        }
    }
}


