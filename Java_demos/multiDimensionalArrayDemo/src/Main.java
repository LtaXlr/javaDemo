public class Main {
    public static void main(String[] args) {
        //çok boyutlu dizi mesela 2 boyutlu dizi isimler ve soy isimler
        String[][] isimSoyIsim = new String[2][2];
        //türkçe karater yazıla yani String  soyİsim olmaz ama söyle yazıla bilir soyIsim String soyIsim = "bu kısım türkçe karakter içere bilir yani ü-İ-ş-ç-ö-ğ-"
        isimSoyIsim[0][0] = "Latif";
        isimSoyIsim[0][1] = "sarıdağ";
        isimSoyIsim[1][0] = "Macit";
        isimSoyIsim[1][1] = "Sarıdağ";
        for (int i = 0;i<isimSoyIsim.length;i++) {
            for(int j=0;j< isimSoyIsim.length;j++){
                System.out.println(isimSoyIsim[i][j]);
            }
        }
    }
}