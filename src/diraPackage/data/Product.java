/**
 * package berguna untuk mengelompokkan class (mirip seperti folder)
 * public --> bisa diakses dari mana saja (meski berbeda package)
 * protected --> hanya bisa diakses di turunannya atau di package yang sama
 * private --> hanya bisa diakses di dalam class
 */

package diraPackage.data;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    /**
     * secara default ketika melakukan print object dari class akan menampilkan hasil dari method .tostring()
     * dengan format "nama" + "@" + "Hash code"
     * sehinnga method toString() bisa di override supaya hasil print lebih mudah dibaca
     */
    public String toString(){
        return "Product name:" + name + ", Price: " + price;
    }

}
