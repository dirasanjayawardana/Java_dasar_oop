// package berguna untuk mengelompokkan class (mirip seperti folder)
// public --> bisa diakses dari mana saja (meski berbeda package)
// protected --> hanya bisa diakses di turunannya atau di package yang sama
// private --> hanya bisa diakses di dalam class

package diraPackage.data;

public class Product {
    protected String name;
    protected int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
