// error --> jenis exception yang akan langsung mematikan aplikasi, tidak disarankan menggunakan try catch dalam penggunaannya

package diraPackage.error;

public class DatabaseError extends Error {
    public DatabaseError(String message){
        super(message);
    }
}
