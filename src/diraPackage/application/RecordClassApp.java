// saat membuat record class, akan otomatis membuatkan constructor, method getter, equals, hashCode, dan tostring, menggunakan kata kunci --> record (bukan class), wajib langsung membuat parameter untuk constructor dan otomatis akan menjadi field dalam class record tersebut
// record class bersifat immutable (tidak bisa berubah), ketika object sudah dibuat, valuenya tidak bisa dirubah lagi
// record class secara otomatis mengextends class java.lang.Record, sehingga record class tidak bisa extend class lain, namun tetap bisa implement interface
package diraPackage.application;
import diraPackage.data.RecordClass;

public class RecordClassApp {
    public static void main(String[] args) {
        RecordClass loginObj = new RecordClass("dira sanjaya", "pass123");

        // mengakses toString dari record class
        System.out.println(loginObj);

        // mengakses getter (dengan nama field, bukan dengan getNamaField())
        System.out.println(loginObj.username());
        System.out.println(loginObj.password());

        loginObj.sayHello();
    }
}
