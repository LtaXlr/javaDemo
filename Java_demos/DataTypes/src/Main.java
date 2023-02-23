public class Main {
    public static void main(String[] args) {
        /*
        * veri kurlları:
        * 1. verinin tipi girilecek
        * verinin ismi (instance) veritipi verininisii = deger;
        * verinin isminde bir tane bile bosluk olamaz
        * verinin isminde asla başında rakam olamaz _ ola bilir mesela _sayi ama 1sayi olamaz
        * var olmayan bir veri tipi kullanılamaz mesela
        * tamsayi sayim = 10; böyle bir veri olmadığı için hata vericek
        *
        * */
        // metinsel veri tipi
        String metin = "merhaba";
        // tek karakterli veri tipi
        char karakter = 'M';
        // tam sayı
        // int tam 2 milyara sayıya kadar destek verir
        int sayi =10;// sayı yazmama gerek yok sayı demesemde anlar

        // büyük tam sayı
        // long ise tirilyon üstü sayıları sahiptir
        long sayibuyuk = 1000;
        // durumsal veri tipi
        // boollean mesela 10 18'den kucuk mü evet ozaman ozmana true ama 10 18'den büyük olsaydı false olurdu
        // if else if derslerinde görürüz hocam devamını
        boolean kucukmu = true;
        //ondalıkllı sayı
        float ondaliklisayi = 13.141442f;//f işareti koymak zorunlu
        double buyukondaliklisayi = 1412421.241254125;//f veya d işareti koymak zourunlu değil
        System.out.println(metin+karakter+sayi+sayibuyuk+kucukmu+ondaliklisayi+buyukondaliklisayi);
    }
}