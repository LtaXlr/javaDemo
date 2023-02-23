public class Main {
    public static void main(String[] args) {
        int sayi1 = 220 ;
        int sayi2 = 284 ;
        int toplam = 0;
        int toplam2 = 0;
        for(int i = 1;i<sayi1;i++){
            // sSystem.out.println(i);
            if(sayi1%i==0){
                toplam += i;
            }
        }
        for(int i = 1;i<sayi2;i++){
            // sSystem.out.println(i);
            if(sayi2%i==0){
                toplam2 += i;
            }
        }
        if(toplam == sayi2){
            System.out.println("kardeş sayılar "+sayi2 + ' ' +sayi1 + ' ' + "arkadaş sayı " + toplam);
        }else{
            System.out.println("arkadaş sayı değildir "+sayi2 + ' ' +sayi1 + ' ' + "arkadaş sayı değildir " + toplam);
        }
        if(toplam2 == sayi1){
            System.out.println("kardeş sayılar "+sayi1 + ' ' +sayi2 + ' ' + "arkadaş sayı " + toplam2);
        }else{
            System.out.println("arkadaş sayı değildir "+sayi1 + ' ' +sayi2 + ' ' + "arkadaş sayı değildir " + toplam2);
        }
    }
}