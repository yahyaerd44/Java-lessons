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

        //Ornek 2 : int data type nin minimum degeri ile byte data type inin maximum degerleri toplamini bulunuz.
        int intmin = Integer.MIN_VALUE;
        byte bytemax = Byte.MAX_VALUE;
        System.out.println(intmin+bytemax);//-2147483521

        //Ornek 3: Primitive int i Wrapper Integer a ceviriniz.(AutoBoxing)
        //Wrapper class ın icine primitime koyuyorsan AutoBoxing olur.

        int num = 19;

        Integer wrapperNum = num;

        //Ornek 4:Wrapper Byte i primitive byte a ceviriniz(unboxing)
        //primitive bir kutuya wrapper esayn edersen bu da unboxing olur

        Byte k = 19;
        byte primitiveK = k;

        //Ornek 5:Primitive char i Wrapper Character e ceviriniz.(AutoBoxing)

        char c = 'A';
        Character wrapperC = c;

        //Ornek 6: Wrapper Boolean i primitive boolean a ceviriniz.(unboxing)

        Boolean yasliMiW= true;
        boolean b=yasliMiW;


    }


}
