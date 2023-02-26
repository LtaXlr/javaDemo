public class Main {//PascalCase
    public static void main(String[] args) {
        System.out.println(emeklilikYasi(1950));//return olarak döndürülüen değeri sys ile yazarsak yaşınıda yazar
        System.out.println("--------------------------");
        emeklilikYasi(1950);
        int toplam = topla(2,3,4,5,6);
        System.out.println(toplam);

    }

    public static void ekle(String isim){// dogum yılı
        System.out.println();
    }
    public static void sil(){
        System.out.println();
    }
    public static void guncelle(){
        System.out.println();
    }
    // return'ü anlamak
    public static int topla(int... sayilar){// int aray bir method method variable oluşur
        int toplam = 0; // sıfırdan başlattık
        for (int topla:sayilar) { // int bir topla oluştur neyi tutsun sayiları sayi degeri atıyorum 1 sen bir toplaya gelir
            toplam+=topla;
        }
        return toplam;
    }
    public static int emeklilikYasi(int dogumTarihi){//cemel case
        //emeklilik yaşı 65 olsun mesela
        int emeklilikYasi = 65;
        int yas = 2023 - dogumTarihi;
        int emekliKalanYas = emeklilikYasi - yas;
        if(yas > emeklilikYasi){
            System.out.println("emeklisiniz");
        }else{
            System.out.println("emekli değilsiniz");
            System.out.println("emekli olmanıza "+emekliKalanYas+' '+"yıl var");
        }
        return yas;
    }
}