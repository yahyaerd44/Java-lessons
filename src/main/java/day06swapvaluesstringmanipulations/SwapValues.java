package day06swapvaluesstringmanipulations;

public class SwapValues {
    //Swap : Yer degistirmek demek.
    public static void main(String[] args) {
        //1. kap : Patates 2. kap Domates ==> swap ==> 1. kap : Domates 2. kap : Domates

        int a = 12;
        int b = 5;//swap den sonra a = 5, b=12
        int temp = 0 ;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("temp = " + temp);
        //1.Adim
        temp =a;
        //2.Adim
        a=b;
        //3.Adim
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //  2.Yol
        int elma = 12;
        int armut = 5;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma + armut;
        armut = elma - armut;
        elma = elma - armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}
