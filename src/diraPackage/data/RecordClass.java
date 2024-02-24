// saat membuat record class, akan otomatis membuatkan constructor, method getter, equals, hashCode, dan tostring, menggunakan kata kunci --> record (bukan class), wajib langsung membuat parameter untuk constructor dan otomatis akan menjadi field dalam class record tersebut
// record class bersifat immutable (tidak bisa berubah), ketika object sudah dibuat, valuenya tidak bisa dirubah lagi
// record class secara otomatis mengextends class java.lang.Record, sehingga record class tidak bisa extend class lain, namun tetap bisa implement interface
// record class bisasanya dikhususkan untuk menyimpan data
package diraPackage.data;

public record RecordClass(String username, String password) {

    // untuk menambahkan custom constructor, sama seperti membuat contructor biasa, namun tanpa parameter ()
    public RecordClass {
        System.out.println("custom constructor dari record class");
    }

    // untuk mebuat constructor overloading, harus memanggil contructor utama
    public RecordClass(String username) {
        this(username, "");
    }

    public RecordClass() {
        this("", "");
    }

    // menambahkan method (untuk mengakses property didalam method, boleh langsung memanggil nama propertynya, tanpa menggunakan this, bisa juga menggunakan this)
    public void sayHello() {
        System.out.println("Hello " + this.username);
    }
}
