// membuat exception class custom (extends dari class Throwable)

package diraPackage.error;

public class ValidationException extends Throwable {
    // private String message;

    // public ValidationException(String message){
    // this.message= message;
    // }

    // public String getMessage(){
    // return message;
    // }

    // secara default get message sudah ada
    public ValidationException(String message){
        super(message);
    }
}
