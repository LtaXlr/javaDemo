public class Main {
    public static void main(String[] args) {
        //başlangıç product1
        Product product1 = new Product(1,"Laptop","Asus Laptop",5000,13);// parametre gönderdik göndermiycek olsak bile constroctor olduğu için Product() var
        //başlangıç product2
        Product product2 = new Product();
        product2.setId(1);
        product2.setName("Computer");
        product2.setStockAmount(13);
        product2.setDescription("Asus Computer");
        product2.setPrice(5000);
        //başlangıç product3
        Product product3 = new Product();
        product3.setId(1);
        product3.setName("Laptop");
        product3.setStockAmount(13);
        product3.setDescription("monster Laptop");
        product3.setPrice(5000);
        ProductManager productManager = new ProductManager();
        // product arrays
        Product[] products = {product1,product2,product3};


        for (Product product:products) {
            productManager.add(product);
            System.out.println(product.getKod());
        }


    }
}