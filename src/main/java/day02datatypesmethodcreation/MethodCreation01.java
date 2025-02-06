package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java'da method nasil olusturulur?

    1)main methodun disinda classin icinde olusturlur
            1                2                  3        4    5
    2) Access modifier  + Return type  +   Method ismi + () + {}
     */
    /*
    Olusturulan methodlar nasil kullanilir?
    1)Methodu olusturmak methodu calistirmak iicin yeterli degildir.Kullanilmak istenen method main method un icinde kullanilir.
    2) method'un ismini +() yazin (kullanmak icin)
    3)varsa islem yapacaginiz datalari parantezin icine koyun bu islem method call(method cagirma )olarak adlandirilir.
    4)method name + parametreler ==> method signature
     */
    public static void main(String[] args) {
        int sonuc=toplamaYap(3,5);
        System.out.println(sonuc);

        long sonuc2=carpmaYap(5,6);
        System.out.println(sonuc2);

        System.out.println(ilkIkisiniCarpSonucuTopla(3,4,5));

        System.out.println(dikdorgeninAlani(3,5));

        System.out.println( dikdortgeninCevresi(3,4));
    }
    //Ornek 1 :toplama islemi yapan bir method olusturunuz
    public static int toplamaYap(int a, int b){//bu kisimda method kapsaminda kullanilmasini ve islenmesini istedigim datalari deklare ediyoruz
   return a+b;
   //return demek bu methodun cagirildigi yere bu degeri return et (geri dondur demek )

    }
    //main method static oldugu icin main method icinde kullanacagimiz method statik olmalidir.
    //Ornek 2 : 2 sayiyi carpma islemi yapan bir method olusturunuz
    protected static long carpmaYap(int a ,int b ){

        return a*b;

    }
    //Ornek 3 : Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz
    private   static int ilkIkisiniCarpSonucuTopla(int a, int b,int c) {
        return a*b+c;

    }
    /*
    1)Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz.
    ')Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
     */
    public static int dikdorgeninAlani(int a,int b){

        return a*b;

    }
public static int dikdortgeninCevresi(int a,int b){

 return (a+b)*2;
}

}
