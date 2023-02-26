public class Main {
    public static void main(String[] args) {
        //referans type
        CustomerManager customerManager = new CustomerManager();
        // steack, heap stack: tanımlandıktan sonra tanımlı kısmı tutar mesela Tanim tanim
        // heap tanımladık'ya ondan sonraki kısım hocam Tanim tanim = new Tanim();
        // 101(örnek.) ramde'ki değer'imiz oluyor ve o heap kısmını temsil ediyor
        // bukadar yanlış biliyorsam github'dan uyarın :)
        CustomerManager customerManager2 ;
        customerManager2 = customerManager;
        customerManager.add();
        customerManager2.add();

        // value type herşey stack'de
        int sayi1 = 10; // sayi1 in degerini 10'a eşitledik
        int sayi2 = 20; // sayi2 nin degerini 20'ye eşitledik;
        sayi2 = sayi1; // sayi2 nin degeri sayi1 oldu yani 10
        sayi1 = 30; // sayi1'in degerini 30 'yaptık
        System.out.println(sayi2);
        int[] sayilar1 = {1,2,3}; //stack de sayilar1 tipine bakılır ve array'miş -
        //- der ve ozaman ben buna sayilar1'den sonra heap kısmına 101(örnek) degerinde bir referans atayım
        int[] sayilar2 = {10,20,30}; // buda aynısı geçerli
        sayilar2 = sayilar1; // sayilar heap'i yani 102(örnek) remdeki adresi oluyor onu 101'e eşitliyoruz gc çöp toplayıcı
        sayilar1[0]=15;// heap kısmı burda değreye giriyor referans güncelleniyor
        System.out.println(sayilar2[0]);
        System.out.println(sayilar2[1]);
    }
}
