package diraPackage.data;
/**
 * untuk heritance interface tidak menggunakan kata kunci extends, tetapi menggunakan implements
 * semua method yang sudah dibuat di interface harus dioverride di child nya
 */
public class Avanza implements InterfaceCar{
    public void drive() {
        System.out.println("Avanza Drive");
    }

    public int getTire() {
        return 4;
    }
}
