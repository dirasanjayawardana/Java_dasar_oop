// stackTrace --> untuk melihat detail ketika terjadi error

package diraPackage.application;

public class StackTraceApp {
    public static void main(String[] args) {

        // try {
        //     String[] names = {
        //             "dira", "sanjaya", "wardana"
        //     };
        //     System.out.println(names[10]);
        // } catch (Throwable throwable) {
        //     StackTraceElement[] stackTraceElements = throwable.getStackTrace();
        //     throwable.printStackTrace();
        // }

        try {
            String[] names = {
                    "dira", "sanjaya", "wardana"
            };
            System.out.println(names[10]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
