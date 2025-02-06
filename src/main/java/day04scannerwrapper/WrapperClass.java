package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive    :   char - boolean - byte -short - int -  long - float - double
        //Wrapper Class: Character-Boolean- Byte- Short- Integer- Long- Float-   Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //o yuzden sart degilse Wrapper class kullanmayi tercih etmeyiz.
        //n yazip koyarsaniz hic method goremezsiniz,cunku primitive ler method icermez.
        int n = 12;

        //m yazip nokta koyarsanizx bircok method gorursunuz, cunku wrapper classlar method icerir.
        Integer m=12;

        //Ornek 1 : short data type inin minumum ve maximum degerlerin kod yazarak bulunuz.
      short maxDegeri=  Short.MAX_VALUE;
        System.out.println("maxDegeri = " + maxDegeri); //maxDegeri = 32767
        short minDegeri= Short.MIN_VALUE;
        System.out.println("minDegeri = " + minDegeri); //minDegeri = -32768


    }


}
