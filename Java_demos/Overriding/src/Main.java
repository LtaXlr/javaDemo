public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManager = new BaseKrediManager[]
                {new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};
        for (BaseKrediManager krediManager : baseKrediManager) {
            System.out.println(krediManager.hesapla(100000));
        }
    }
}