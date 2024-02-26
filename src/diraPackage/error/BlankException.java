// runtime exception --> exception yang tidak wajib menggunakan try catch untuk penggunaannya, namun jika terjadi error maka aplikasi akan mati

package diraPackage.error;

public class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}
