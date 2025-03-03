package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Ornek 1: Bir string in bas ve sonunda space character i varsa siliniz
        //"  Ali Can  " ==>"Ali Can"
        String s = " Ali Can ";
        System.out.println(s);
        //trim()  methodu ,kırpmak demek,bir string in bas ve sonundaki space character lerini varsa siler
        // aradaki space'lere karısmaz
        String sTrimed = s.trim();
        System.out.println(sTrimed);

        //Ornek 2: Asagıdaki fiyatlari verilen urunlerin toplam fiyatlarini bulunuz
        //String tv = "$456.99";  String laptop = "$875.99"; ==>456.99+875.99 = 1332,98
        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2 = tv.replace("$", "");
        System.out.println(tv2);

        String laptop2 = laptop.replace("$", "");
        System.out.println(laptop2);

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);//valueOf method girilen String i Double ye ceviriyor
        System.out.println(totalPrice);

        //Ornek 3. Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz
        // "Ali Can" ==> AC

        String name = "  ali cAN  ";
        //split() : methodu bolmek ,parcalamak anlamına gelir.Bir string i istedigimiz karakterden parcalamaya yarar
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);//C
        System.out.println(""+first+last);//AC
    }
}
