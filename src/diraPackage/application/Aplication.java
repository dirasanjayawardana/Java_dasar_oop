package diraPackage.application;

// class harus diimport karena berada dipackage yang berbeda (harus merupakan class public)
//import diraPackage.data.Data;
//import diraPackage.data.Product;

// cara import semua class dalam suatu package, dengan tanda *
import diraPackage.data.*;

public class Aplication {
    public static void main (String[] args) {
        Product product = new Product("Dummy product", 1000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
