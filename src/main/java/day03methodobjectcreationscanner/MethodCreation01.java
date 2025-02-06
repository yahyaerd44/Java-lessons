package day03methodobjectcreationscanner;


public class MethodCreation01 {
    public static void main(String[] args) {
  double kup= kupHesapla(5);
        System.out.println("kup = " + kup);
      Yaz("java kolaydir");

      //method olusturmak icin ikinci yol
        // Ornek 2 ikinci yol :Girilen bir kelimeyi ekrana yazdıran bir method olusturup kullaniniz.tech pro edication
        //main method icinde iken method ta kullanilacak olan variable lari olusturunuz.
        String str = "TechproEdu";
        //method ismi ve parametreleri yazariz
        //kirmizi kismin uzerinde bekleyip creat method a tıklarız
        // intelij otomatik olarak bir method olusturur daha sonra kendi istegimiz gore dizayn ederiz
        printConsole(str);
    //Ornek 3 : Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        int a=3;
        int b=5;
        carpmaYap(a,b);
        //Ornek 4 :Verilen bir tam sayinin karesini hesaplayip konsola yazdiran methodu olusturup kullaniniz.
        int c=5;
        karesiniAl(c);

    }

    public static void karesiniAl(int c) {
        System.out.println(c*c);
    }

    public static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);

    }


    static double kupHesapla(double a){

return a*a*a;


 }
 //Note :Access modifier i default yapmak isterseniz access modifier i YAZMAYINIZ...
//Ornek 2:Girilen bir kelimeyi ekrana yazdıran bir method olusturup kullaniniz.
    public static void Yaz(String str){
        System.out.println(str);

    }
//Eger bir method yeni bir data uretmiyorsa return type i void olur.
// methodun return type i void ise method body icinde return keywordu yazilmaz.
    /*
    Homework :
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
    2)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz.

     */
}
