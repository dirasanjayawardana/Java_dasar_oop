package diraPackage.data;
/**
 * ketika membuat file dengan interface maka semua method otomatis abstract dan public
 * dalam interface tidak boleh ada field, hanya boleh field yang constant (tidak bisa diubah)
 * untuk heritance interface tidak menggunakan kata kunci extends, tetapi menggunakan implements, semua method harus dioverride di child nya
 */
public class Avanza implements InterfaceCar{
    public void drive() {
        System.out.println("Avanza Drive");
    }

    public int getTire() {
        return 4;
    }
}
