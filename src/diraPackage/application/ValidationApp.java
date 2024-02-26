package diraPackage.application;

import diraPackage.error.ValidationException;
import diraPackage.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        // akan muncul error karena throw exception di class validation Util, wajib menggunakan try catch
        // jika ada dua exception, maka bisa menambah blok catch, atau dengan operator | pada block catch
        // finnaly --> blok yang akan dieksekusi ketika blok try atau catch telah dieksekusi
        try {
            ValidationUtil.validate(null);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi error : " + e.getMessage());
        } finally {
            System.out.println("execute finnaly block");
        }

        // contoh runTime exception (tidak wajib menggunakan try catch, namun jika terjadi error maka aplikasi akan mati)
        ValidationUtil.validateRuntime("dira");
        System.out.println("sukses melewati runtime exception");

        // contoh error exception (jika terjadi error maka akan langsung mematikan aplikasi, tidak disarankan menggunakan try catch)
        ValidationUtil.validateError("dira");
        System.out.println("sukses melewati error exception");
    }
}
