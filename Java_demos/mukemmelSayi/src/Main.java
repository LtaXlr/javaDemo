public class Main {
    public static void main(String[] args) {
        int sayi = 12;
        int mukemmelsayilar = 0;
        for(int i = 1;i<=sayi;i++){
            if(sayi%i==0){
                int total = 0+i;
                if(i < sayi){
                    System.out.println("arkadaş sayılar: " + total);
                }
                mukemmelsayilar = total;
            }
        }
        System.out.println("toplam sayı : "+mukemmelsayilar);
    }
}