package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
   /* Example :
        Password'un ilk harfi buyuk harf ise
         'A' olursa "gecerli password" yazdirin
        Adana ==> Gecerli
        Passwordun ilk harfi kucuk harf ise
        'z' olursa "gecerli oassword" yazdirin degilse
        "gecersiz password" yazdirin
        zehirli==>Gecerli
     */
        //Note : Eger bir methodu tekrar tekrar kullanmak istiyorsaniz onu bir variable a atayarak kullanmak daha makuldur
        //ornek char firstChar = pwd.charAt(0); gibi
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz..");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0);

        if (firstChar>='A' && firstChar<='Z') {//Password'un ilk harfi buyuk harf ise
            if (firstChar=='A') {
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz password cunku harf buyuk ama A degil");
            }
        } else if (firstChar>='a' && firstChar<='z') {// Passwordun ilk harfi kucuk harf ise
            if (firstChar=='z'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password cunku kucuk harf ama z degil");
            }
        } else {
            System.out.println("Ilk karakter harf olmali");
        }
    }
}
