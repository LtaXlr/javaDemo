public class Main {
    public static void main(String[] args) {
        /* array'lere giriş diziler nedir
        *  aray referans tiplidir referansı ve dahasını snora öğrenirsiniz
        *  diziler yada array'ler
        * dizi'de mesela 3 elemanı olan bir dizi 0 1 2 diye yazılır aray 0'dan başlar
        * */
        String[] sehirler = {"Adana","Bursa","Ceyhan","Denizli","Eskisehir"};//bir değişkenin array(dizi) olması için [] gerekir
        //içine deger attık
        //for döngüsü ile gezdik
        for (int i = 0; i < sehirler.length; i++) {//i = 0 i sıfırdan başlasın i<sehirler.lenght i küçük olduğu sürece sehirlerin elemanlarından i++i'yi bir artır
            System.out.println(sehirler[i]);//i sehirlerin karakterleri kadar gezer hocam bu yüzden sehirlerin karaterlerini 0 1 veya 2 diye değil i diye yazdık
        }//veya
        System.out.println("----------FOR DÖNGÜSÜ BİTTİ -----------");
        int i = 0;
        while (i< sehirler.length){
            System.out.println(sehirler[i]);
            i++;
        }
        System.out.println("--------------WHİLE DONGUSU BİTTİ -----------------");
        int j = 0;
        i=0;//değişkeni burda sıfıra atadık bunu da kullana bilirsiniz
        do {
            System.out.println(sehirler[j]);
            j+=1; // i++ yerine de kullanıla bilir dedim ;)
        }while(j< sehirler.length);
        System.out.println("--------------- DO-WHİLE DÖGÜSÜ BİTTİ ----------------");
    }
}