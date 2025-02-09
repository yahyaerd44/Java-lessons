package day05concatinationoperatortypecasting;

public class TypeCasting {
    /* //Data tipi donusturmek anlamına gelir
    Numeric primitive data type larinin birbirine donusturulmesine "Type Casting" denilir.
    Numeric (sayisal) primitive DAta type lar : byte - short - int - long - float - double

     */
    //Note 1 : Kucuk data tyoe larini buyuk data typelarina cevirmeyi java otomatik olarak yapabilir.
    //Bu isleme "AutoWidening"(otomatik genisletme) denir.

    //Note 2 :Buyuk data type larini kucuk data typelarina cevirmek riskli bir istir, java bu riskli
    //isi otomatik olarak yapmaz, bu islemi kod yazanlar yaparlar
    //Bu isleme "ExplicitNarrowing"(A)
    public static void main(String[] args) {

        //byte data type ini int data type ina ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type ini short data type ina ceviriniz
        int agirlik = 313;
        short agirlikShort =(short) agirlik;//Explicit Narrowing

        //int data type ini float data type ina ceviriniz
        int population = 77000;
        System.out.println(population);
        float populationFloat =population;
        System.out.println(populationFloat);//77000.0

        //double data type ini short data type ina ceviriniz
        double number = 12.99;
        System.out.println(number);//12.99
        short numberShort = (short) number;
        System.out.println(numberShort);//12

        //ornek
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //NOT :
        //Donusum  yaptiginiz sayi (260), donuseceginiz data type ini sinitlari disinda ise
        // java kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degerleriniz olur

        //7.derste kaldım



    }

}
