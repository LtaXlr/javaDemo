public class Main {
    public static void main(String[] args) {
        int sayi = 122532563;
        if(sayi <= 1){
            System.out.println("2'den küçük değer girilemez");
        }
        boolean asalmi = true;
        for(int i = 2;i<sayi;i++){
            if(sayi%i==0){
                asalmi = false;
                System.out.println("asal değil çünki bölenleri var bölenleri " + i);
            }
        }
        if(asalmi == true){
            System.out.println("asal sayıdır " + sayi);
        }else{
            System.out.println("asal sayı değildir " + sayi);
        }
        System.out.println(asalmi);
    }
}