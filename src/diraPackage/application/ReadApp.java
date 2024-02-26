// try with resource --> akan otomatis menutup resource setelah blok try dijalankan
// resource -- contohnya disini adalah BufferReader

package diraPackage.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        // // ketika membuka BufferReader, maka wajib untuk close BufferReader
        // BufferedReader reader = null;

        // // menutup.clode reader secara manual
        // try {
        //     reader = new BufferedReader(
        //             new FileReader("README.md"));

        //     while (true) {
        //         String line = reader.readLine();
        //         if (line == null) {
        //             break;
        //         }
        //         System.out.println(line);
        //     }
        // } catch (Throwable throwable) {
        //     System.out.println("error membaca file : " + throwable.getMessage());
        // } finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //             System.out.println("sukses menutup...");
        //         } catch (IOException e) {
        //             System.out.println("error menutup resource : " + e.getMessage());
        //         }
        //     }
        // }

        // menggunakan try with resource (akan otomatis close resource dalam hal ini adalah BufferReader)
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while (true){
                String text = reader.readLine();
                if (text == null){
                    break;
                }
                System.out.println(text);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
