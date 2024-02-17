package diraPackage.data;

public class ProductApp {
    public static void main (String[] args) {
        Product product1 = new Product("iphone", 1000);
        Product product2 = new Product("iphone", 1000);
        System.out.println(product1.name); // bisa mengakses name dan price karena berada di package yang sama karena bertipe protected
        System.out.println(product1.price); // bisa mengakses name dan price karena berada di package yang sama karena bertipe protected
        System.out.println(product1); // akan memanggil method .toString()
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode() == product2.hashCode());

        var getterSetter = new GetterSetter();
        getterSetter.setId("123");
        System.out.println(getterSetter.getId());
        System.out.println(getterSetter.getExpensive());
    }
}
