package diraPackage.application;

import diraPackage.data.EnumClassImpl;
import diraPackage.data.EnumClass;

public class EnumApp {
    public static void main(String[] args) {
        EnumClassImpl customer = new EnumClassImpl();
        customer.setName("Dira sanjaya");

        // mengisikan data pada properti sebuah class dengan data yang dibuat dengan enum class
        customer.setLevel(EnumClass.STANDARD);
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        // konversi nama enum menjadi string
        String levelString = EnumClass.VIP.name();
        System.out.println(levelString);

        // konversi string ke enum
        EnumClass level = EnumClass.valueOf("PREMIUM");
        System.out.println(level);

        // mendapatkan semua enum option
        System.out.println("---- print levels ---");
        EnumClass[] levels = EnumClass.values();
        for (var value: levels){
            System.out.println(value);
        }
    }
}
