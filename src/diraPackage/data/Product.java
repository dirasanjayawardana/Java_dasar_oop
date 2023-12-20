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

    /**
     * method equals digunakan untuk membandingkan object
     * sangat disarankan untuk ovrride method equals()
     */
    public boolean equals(Object item){
        if (item == this) {
            return true;
        }
        if (!(item instanceof Product)) {
            return false;
        }
        Product product = (Product) item;

        if(this.price != product.price) {
            return false;
        }
        if(this.name != null){
            return this.name.equals(product.name);
        } else{
            return product.name == null;
        }
    }

    /**
     * method hashCode() mirip seperti toString()
     * bedanya hashcode() adalah representasi dalam bentuk integer, bukan string seperti toString()
     */
    public int hashCode(){
        int result = name != null ? name.hashCode() : 0;

        result = 31 * result + price;

        return result;
    }
}
