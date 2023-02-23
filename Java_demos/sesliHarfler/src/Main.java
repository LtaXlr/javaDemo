public class Main {
    public static void main(String[] args) {
        // ince sesli harf e,i,ö,ü
        // kalın sesli harf a,ı,o,u
        char character = 'r';
        switch (character){
            case 'e':
                System.out.println("ince sesli harf " + character);
                break;
            case 'i':
                System.out.println("ince sesli harf " + character);
                break;
            case 'ö':
                System.out.println("ince sesli harf " + character);
                break;
            case 'ü':
                System.out.println("ince sesli harf " + character);
                break;
            case 'a':
                System.out.println("kalın sesli harf " + character);
                break;
            case 'ı':
                System.out.println("kalın sesli harf " + character);
                break;
            case 'o':
                System.out.println("kalın sesli harf " + character);
                break;
            case 'u':
                System.out.println("kalın sesli harf " + character);
                break;
            default:
                System.out.println("yanlış karakter "+character);
        }
    }
}