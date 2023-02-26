public class Product {
    public Product(){//eğerki bir değer yoksa bu çalışır yani Product("boşsa")
        System.out.println("yapıcı blok çalıştı");
    }

    public Product(int id,String name,String description,double price, int stockAmount){//eğerki bunların hepsi doluysa
        this();// this koyduk çünki değer döndürmeyen bir constroctır olsun
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }
    /*
    * kap sülleme
    * mesela biz id'yi(tc no gibi düşün herkez eriş mesin) private yaptık
    * e biz buna erişmek istiyoruz belki uzaktan erişmesine izin verilemez id veya diğerlerinin
    * get(değeri okur) set(değeri yazar)
    * */
    // attribute veya field

    private int id;// bu id ileriki zamanlarda arka planda yazılım kendi idsini vericek 1. ürünse id = 1 10. ürünse id = 10
    private String name;// isim
    private String description;// detay
    private double price;// fiyat
    private int stockAmount;// adet
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getKod(){
        return name.substring(0,1)+id;
    }
}