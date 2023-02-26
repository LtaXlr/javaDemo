public class Main {
    public static void main(String[] args) {
        sayiBul();
    }
    public static void sayiBul(){
        int[] sayilar = {1,2,5,7,9,0};
        int aranacak = 1;
        for(int i = 0;i<sayilar.length;i++){
            if(sayilar[i] == aranacak){
                mesajVer(1);
            }
        }
    }
    public static void mesajVer(int aranacak){
        System.out.println("aranan sayı: "+aranacak);
    }
}