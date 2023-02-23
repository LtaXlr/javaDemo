public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1,2,5,7,9,0};
        int aranacak = 1;
        for(int i = 0;i<sayilar.length;i++){
            if(sayilar[i] == aranacak){
                System.out.println("aranan sayı: "+sayilar[i]);
            }
        }
    }
}