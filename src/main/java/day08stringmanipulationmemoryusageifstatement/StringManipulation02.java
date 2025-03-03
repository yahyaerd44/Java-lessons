package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Ornek : Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //kodun dinamik olmasi birden fazla seneryoda calısması demek or: gmail yerine hotmail de yazılabilir
        //abc@gmail.com ==> gmail

        String a = "abc@gmail.com";

        int startingIndex = a.indexOf('@') + 1;// +1 birinci indexten sonraki indexi al dedik dinamik kod yaptık
        int endingIndex = a.indexOf('.');

        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);//companyName = gmail

        System.out.println("hard coding==>" + a.substring(4, 9));//  //hard kod kotu kod yazmak demektir dinamik degildir

        //Ornek 2: Verilen iki string in birbirlerinin aynisi olup olmadıgını kotrol eden kodu yaziniz.
        String h = "ali Can";
        String i = "Ali Can";
        //equals : esit mi ye bakar
        boolean result = h.equals(i);//burada sunu dedik h esit mi i ye buradan kasıt karakterler esit miyi verir
        System.out.println(result);//false
        //Java da Memory kullanimi
        /*
        java da iki tane memory vardir
        1)stack memory :
         a)kucuk memory ==>small
         b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2)heap memory:buyuk memory ==>Huge
         a)Buyuk memory dir
         b)Non-Primitive datalari icerir.
         ==> Java heap memory de yerlestirilen tum Non-Primitive datalar icin bir adres olusturur
         ve bu adresi stack memory de saklar
         */

        /*
        Note :String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz ?
        Cunku;"==" sembolu iki string i karsilastirirken hem adreslerine hem de degerlerine bakar,
        ikiside ayni ise stringler esittir der.ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz.Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki strging
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duydugumuz seydir
         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s == t);//false verir cunku adreesler ve degerler farklidir
        System.out.println(s.equals(t));//false cunku degerler farklidir
        System.out.println(s == r);//false cunku adreesler farklı
        System.out.println(s.equals(r));//true cunku wquals ()sadece degerlere bakar."s" ve "r" nin degerleri ayni
        // oldugunda true verir
//-------------------------------------------------------------------------------------------------------------------------------------
        //Ornek 3:Verilen iki string in birbirlerinin aynisi olup olmadıgını buyuk-kucuk harf dikkate almadan
        // kotrol eden kodu yaziniz.
        //wqualsIgnorCase() iki string in birbirlerinin aynisi olup olmadıgını buyuk-kucuk harf dikkate almadan kontrol eder

        String j = "ali Can";
        String k = "Ali Can";
        boolean result3 = j.equalsIgnoreCase(k);//ignor demek gormezden gel demek.buyuk-kucuk harflere bakmaz
        System.out.println(result3);//true

        /*
        Homework
        1-Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        2)Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a
         buyuk harflerler yazdiriniz
         3)Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdirin
         +)Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isminin ilk harfini buyuk harfle
         diger harflerini kucuk harfle console a yazdirin
         5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
         a)En az 6 cracter olsun
         b)En az bir tane buyuk harf olsun
         c)En az bir tane kucuk harf olsun
         d)En az bir tane rakam olsun

         Note 1:once canli oturum sirasında cozulen ornekleri yapiniz
         Note 2:Tum sorular dinamik kodlarla cozulmelidir
         Note 3:Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir ya da yardim isteyebilirsiniz









         */
    }
}
