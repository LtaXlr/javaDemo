public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,1.3,4.3,5.6};
        double total = 0;
        double enBuyuk = 1.1;
        double enbuyuksayibul = 0.0;
        for (double mylist : myList) {//farklı for döngüsü foreach döngüsü yani
            if(mylist>enBuyuk){
                enbuyuksayibul=mylist;
            }
            total += mylist;
        }
        System.out.println("en büyük sayı: "+enbuyuksayibul);
        System.out.println("toplam sayı: " + total);
    }
}