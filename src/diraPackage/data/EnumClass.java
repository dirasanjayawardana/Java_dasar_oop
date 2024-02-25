// enum class --> class yang berisikan nilai yang terbatas, misal gender nilainya hanya male atau female saja, misal tingkatan level customer nilainya standard, premium, atau vip
// seperti membuat tipe data baru yang hanya bisa berisikan nilai-nilai tertentu
// saat membuat enum class akan otomatis mengextends java.lang.Enum, sehingga tidak bisa extends class lain, tetapi masih bisa implements interface
// menggunakan kata kunci --> enum, biasanya atributnya huruf besar (boleh saja huruf kecil)

package diraPackage.data;

public enum EnumClass {
    // // enum class tanpa constructor
    // STANDARD,
    // PREMIUM,
    // VIP

    // enum class dengan constructor (constructor tidak boleh public)
    STANDARD("Standard edition"),
    PREMIUM("Premium edition"),
    VIP("VIP Edition");

    private String description;

    EnumClass(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
