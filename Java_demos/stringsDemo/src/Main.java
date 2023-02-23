public class Main {
    public static void main(String[] args) {
        String durum = "Bugün Hava Çok Güzel ";
        // bu değerlere sonradan ulaşmak isterseniz bir değişkene atayın!!!
        /*System.out.println("karakterler = " + durum.length()); // karakterlerini yazar hocam
        System.out.println("5. eleman: " + durum.charAt(4)); //charat 0'dan başlar ve hangi index yazarsan o indeksi yazar 6.indekse ulaşıcaksan 5 yazmalısın charat'a
        String durumOzel = durum.concat("yaşasın");// yaşasın diye bir şeyi son indeksden sonra ekler verilen String deger = "selam ";
        // deger.concat("sana "); deger atarsan sonra başka yerde kullanırsın
        System.out.println(durumOzel);//ekrena yazdırdık
        System.out.println(durum.startsWith("B"));//mesela b ile başlıyormu b ile başlamıyorsa false başlıyorsa true dönürür büyük küçük harflere dikkat et
        System.out.println(durum.endsWith("G"));//sondan başlar ve onu bulur
        char[] karakterler = new char[5];
        durum.getChars(0,5,karakterler,0);//0'dan başlar 5'e kadar gider yani 4 ama 0 dahil olmaz get charsda karkterleri yazdıır 0.indeksden başlar
        System.out.println(karakterler); // ekrana yazdırır
        System.out.println(durum.indexOf('a')); // 'a' kaçıncı indeksde
        System.out.println(durum.lastIndexOf('a'));//sondan başlar ve a'yı bulur*/
        System.out.println(durum.replace('B','ş'));//verilen bir karakteri diğer karaktere cevirir
        System.out.println(durum.substring(2,5));

        for(String kelime:durum.split(" ")){//bir String'i parçalar ve ayırır dizi işlemi gibi hocam
            System.out.println(kelime);
        }
        System.out.println(durum.toLowerCase());// bütün elemanları küçük yap
        System.out.println(durum.toUpperCase());// bütün elemanları büyük yap
        System.out.println(durum.trim());
    }
}