package diraPackage.data;

public class ProductApp {
    public static void main (String[] args) {
        Product product1 = new Product("iphone", 1000);
        System.out.println(product1.name); // bisa mengakses name dan price karena berada di package yang sama karena bertipe protected
        System.out.println(product1.price); // bisa mengakses name dan price karena berada di package yang sama karena bertipe protected
    }
}
