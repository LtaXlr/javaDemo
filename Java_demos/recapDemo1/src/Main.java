public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        sayi1 = 12;
        sayi2 = 13;
        sayi3 = 3;
        if(sayi1>sayi2 && sayi1>sayi3){
            System.out.println("sayi1 büyüktür "+sayi1);
        }else if(sayi2>sayi1 && sayi2>sayi3){
            System.out.println("sayi2 büyüktür "+sayi2);
        } else if (sayi3 >sayi2 && sayi3>sayi1) {
            System.out.println("sayi3 büyüktür "+sayi3);
        } else if (sayi1==sayi2 && sayi1 == sayi3) {
            System.out.println("bütün sayılar eşittir " + sayi1 + ' ' + sayi2 + ' '+sayi3);
        }
    }
}