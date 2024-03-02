// beberapa annotation bawaan java
// @Override --> menandai bahwa method yang mengoverride method parent classnya
// @Deprecated --> menandai bahwa method tidak direkomendasikan digunakan
// @FunctionalInterface --> menandai bahwa class tersebut bisa dibuat sebagai lambda expression

package diraPackage.application;

import diraPackage.annotation.Fancy;

// menggunakan annotation (seperti menambahkan informasi tambahan)
@Fancy(name = "car", tags = { "aplication", "java" })
public class Annotation {
    public static void main(String[] args) {
        System.out.println("Halo Dunia...");
    }
}
