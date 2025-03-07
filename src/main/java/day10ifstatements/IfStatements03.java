package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz..");
        String montname = input.next();
        if (montname.equalsIgnoreCase("January")) {
            System.out.println("1");
        } else if (montname.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (montname.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (montname.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (montname.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (montname.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (montname.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (montname.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (montname.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (montname.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (montname.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (montname.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Invalid month name..(gecersiz ay ismi)");
        }
    }
}
