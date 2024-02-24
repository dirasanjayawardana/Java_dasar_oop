package diraPackage.application;

// class harus diimport karena berada dipackage yang berbeda (harus merupakan class public)
//import diraPackage.data.Data;
//import diraPackage.data.Product;

// cara import semua class dalam suatu package, dengan tanda *
import diraPackage.data.*;

// melakukan import static sehingga untuk mengkases propery static tidak perlu menggunakan nama classnya (import static namaPackage.namaClass.*)
import static diraPackage.data.Product.CONTOHSTATICBLOCK;

public class Aplication {
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

        //------ mengakses static blok dari suatu class (namaClass.namaPropertyStatic) ------//
        System.out.println(Product.CONTOHSTATICBLOCK);
        // karena sudah import static, bisa akses property static secara angsung
        System.out.println(CONTOHSTATICBLOCK);
    }
}
