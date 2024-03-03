package standardClass;

public class NumberClassApp {
    public static void main(String[] args) {

        // selengkapnya lihat di dokumentasinumber class
        // Byte byteValue() --> merubah menjadi tipe byte
        // Double doubleValue() --> merubah menjadi tipe double
        // Float floatValue() --> merubah menjadi tipe float
        // Integer intValue() --> merubah menjadi tipe int
        // Long longValue() --> merubah menjadi tipe long
        // Short shortValue() --> merubah menjadi tipe short
        Integer nilaiInteger = 10;
        Byte nilaiLong = nilaiInteger.byteValue();
        System.out.println(nilaiLong);
        
        // konversi string ke Number --> parseTipenumber(string) untuk konversi string ke tipe data number primitif, valueOf(string) untuk konversi string ke tipe data number non primitif
        // jika gagal (contoh string nya bukan angka) akan throw NumberFormatException, tidak perlu try catch
        // tipe data primitif (tidak punya referensi class, nilai default tergantung tipe data/ false, "", 0), tipe data non primitif (punya referensi class, nilai default null/tidak ada)
        String contohString = "1000";
        Integer integerNonPrimitif = Integer.valueOf(contohString);
        int integerPrimitif = Integer.valueOf(contohString);
        System.out.println(integerPrimitif);
    }
}
