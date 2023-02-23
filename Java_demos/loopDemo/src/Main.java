public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {//i = 0 i sıfırdan başlasın i<10 i 10'dan 10 dahil değil çünki 10'a kadar'dır i ++ i'yi 1 artır yada i +=1 yada i  = i+1
            System.out.println(i);
        }//neden i kullandık ve hata vermedi söyliyim değişken tanımlandığı yerde kullanılırda ondan
        System.out.println("for durdu ++");
        int i = 0;  // i'nin tanımı
        int j = 10; // j'nin tanımı
        while(i<10){//i 10 dan küçük olduğu sürece
            System.out.println(i); //i'yi yazdırdım
            i++; //i'yi bir artır demek yada i+= 1 de diye bilirsiniz
        }
        System.out.println("while durdu ++");
        int z = 0;
        do {
            System.out.println(z);
            z++;//z'yi 1 artır veya z+=1;
        }while(z<10);// z küçük oldğu sürece 10'dan
        System.out.println("do-while durdu ++");
        for (int b = 10; i > 0; i--) {//b <10 b 10'dan küçük olana kadar i>0
            System.out.println(i);//yazdırdık
        }
        System.out.println("for döngüsü durdu --");
        while(j>0){
            System.out.println(j);//j'yi yazdır
            j--;//j bir bir eksilt
        }
        System.out.println("while döngüsü durdu --");
        int c = 0;
        do {
            System.out.println(c);
            c--;//c'yi yazdır yani 1'se bir yazdır diyoruz
        }while(c>-10);//c büyük olduğu sürece -10'dan
        System.out.println("do-while döngüsü durdu --");//döngünün bitiğine dair yazı
    }
}