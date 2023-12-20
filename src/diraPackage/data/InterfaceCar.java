package diraPackage.data;
/**
 * ketika membuat file dengan interface maka semua method otomatis abstract dan public
 * dalam interface tidak boleh ada field, hanya boleh field yang constant (tidak bisa diubah)
 * untuk heritance interface ke child class tidak menggunakan kata kunci extends, tetapi menggunakan implements, semua method harus dioverride di child nya
 * untuk inheritance dari interface satu ke interface yang lain tetap menggunakan kata kunci extends
 * semua method yang sudah dibuat di interface harus dioverride di child nya kecuali method default
 */
public interface InterfaceCar {
    void drive();
    int getTire();

    default boolean isBig() {
        return false;
    }
}
