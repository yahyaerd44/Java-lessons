package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
    //Object nasil olusturulur

        //new keywordu sifirdan yeni bir object olusturmak icin kullanilir.
        // Constructor java da objelerş olusturmak icin kullanilan ozel bir methodtur
    //Class ismi + Object ismi + Assigment Operator + "new keywordu"+   Constructor
        Car          myCar               =                 new             Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);

        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();
       Student aliCan =new Student();

        System.out.println("aliCan.adres = " + aliCan.adres);
        System.out.println("aliCan.name = " + aliCan.name);
        aliCan.dersCalısır();
        aliCan.beslenme();
        //homework :
        //icinde isim ve yas variable lari ile teach(ogretmek) methodu bulunan bir teacher
        //objecti olusturun ve object üzerinde bu ozellikleri kullanin

    }


}
