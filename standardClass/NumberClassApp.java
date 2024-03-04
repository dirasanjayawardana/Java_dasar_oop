package standardClass;

import java.math.BigDecimal;
import java.math.BigInteger;

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

        // BigNumber untuk menghandle angka yang besar, melebihi kapasitas Long dan Double
        // BigInteger (untuk nilai integer yang besar) dan BigDecimal (untuk nilai decimal yang besar)
        // untuk melakukan operasi matematika, bisa menggunakan method --> add (+), subtract (-), multiply (*), devide (/), mod (%), dll
        BigInteger nilaiIntegerBesar = new BigInteger("1000000000000000000");
        BigInteger nilaiIntegerBesar2 = new BigInteger("100000000");
        System.out.println(nilaiIntegerBesar.add(nilaiIntegerBesar2));
    }
}
