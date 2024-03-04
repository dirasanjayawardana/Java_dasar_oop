package standardClass;

import java.util.Scanner;

public class ScannerClassApp {
    public static void main(String[] args) {
        
        // class scanner --> untuk membaca input
        // nextLine() --> membaca string
        // nextInt() --> membaca int
        // nextLong() --> membaca long
        // nextBoolean() --> membaca boolean
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

    }
}
