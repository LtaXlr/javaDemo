public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2;
        sayi1 = 10;
        sayi2 = 20;
        if(sayi1 > sayi2){//şart giriş kısmı
            System.out.println(sayi1+" büyüktür "+sayi2);
        } else if (sayi1 == sayi2) {//farklı koşullar atamak için
            System.out.println(sayi1+" eşittir "+sayi2);
        } else{//tam tersi durumda
            System.out.println(sayi1+" küçkütür "+sayi2);
        }
        /*
        * diye bilirisiz ben neden else kullandım
        * else kullandık çünki if kulansaydık yeni bir şart bloğu açardık
        * tek bir şart blouğunda tek bir şart çalışır haberinize
        * */
    }
}