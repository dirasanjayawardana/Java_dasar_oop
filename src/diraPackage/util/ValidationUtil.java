// mengembalikan exception, menggunakan kata kunci --> throw new namaException("message")
// jika class memungkinkan mengembalikan dua jenis exception atau lebih, menggunakan tanda koma saat throws exception
package diraPackage.util;

import diraPackage.error.BlankException;
import diraPackage.error.DatabaseError;
import diraPackage.error.ValidationException;

public class ValidationUtil {
    // NullPointerException adalah salah satu exception bawaan java
    public static void validate(String args) throws ValidationException,NullPointerException {
        if (args == "") {
            throw new ValidationException("error empty value");
        } else if (args == null) {
            throw new NullPointerException("error null value");
        }
    }

    // runtime exception tidak wajib mendeklarasikan throws namaExceptionnya
    public static void validateRuntime(String args){
        if(args.isBlank()){
            throw new BlankException("field is blank");
        }
    }

    // menggunakan error exception
    public static void validateError(String args){
        if(args == null){
            throw new DatabaseError("database error exception");
        }
    }
}
