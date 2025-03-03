package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini(Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol lenght() methodu ile cozum
        String str = "";
        boolean result1 = str.length() == 0;//result -> sonuc demek
        System.out.println("String bos mu? " + result1);//String bos mu? true

        //2.yol tavsiye edilir
        //java bir konuda method olusturmussa , o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("is Empty ?" + result2);//is Empty ?true

        //Ornek 2:Bir string in space haric hicbir chracter icermedigini kontrol eden kodu yaziniz.
        String t = "       ";
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);

        //2.yol
        boolean result4 = t.replace(" ", "").isEmpty();//sayısal olarak bos muyu kontrol eder.
        System.out.println(result4);

        //3.yol
        //isBlank() methodu bir string in space haric hicbir chracter icermedigini kontrol eder
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir karakter var ise false verir
        //isBlank() methodu metinsel anlamda, yani kelime anlamında bos muyu kotrol eder.
        //isBlank() methodu bos stringler icin de true verir.
        //isBlank() methodu space + hicbir sey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.
        //isEmpty() karakter sayısına bakıyor
        boolean result5 = t.isBlank();
        System.out.println(result5);

        //Ornek 3 : Bir string de a,i,e chracterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //"Java is easy to learn"(Java ogrenmesi kolaydır) ==> 1+5+8 ==>14
        // 0123456789...index
        String r = "Java is easy to learn";
        //indexOf() methodu bir string icerisinde aranan karakterin ilk gorunumunun index ini verir
        int indxA = r.indexOf('a');// of=> nın eki burada a'nın index i anlamını verir
        System.out.println(indxA);//1

        r.indexOf('i');
        int indxI = r.indexOf('i');
        System.out.println(indxI);//5

        r.indexOf('e');
        int indxE = r.indexOf('e');
        System.out.println(indxE);//8

        System.out.println(indxA + indxI + indxE);//14

        //Ornek 4: Bir string deki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz.
        //"Ah Java vah Java sensiz olmuyor Java."
        //indexOf(Java) kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfi (yani J nin) index inin almıs olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf() methodu olmayan charterter icin kullanilirsa her zaman -1 return eder.
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1

        //Ornek 5 : Bir string de a,i,e chracterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        String v = "Java is easy to learn";

        //lastIndexOf() methodu aradıgımız karakterin son gorumunun index ini verir.
        int indexOfa = v.lastIndexOf('a');
        System.out.println(indexOfa);//18

        int indxOfe = v.lastIndexOf('e');
        System.out.println(indxOfe);//17

        int indxOfi = v.lastIndexOf('i');
        System.out.println(indxOfi);//5

        System.out.println(indexOfa + indxOfe + indxOfi);//40


    }
}
