public class Main {
    public static void main(String[] args) {
        // switch blokları if lere göre az kullanılır
        String yetki = "admin";
        switch (yetki){
            case "admin":
                System.out.println("adminsiniz");
                break;
            default:
                System.out.println("admin değilsiniz");
                break;
        }
    }
}