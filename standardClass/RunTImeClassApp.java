package standardClass;

// runtime class --> untuk melihat informasi environment tempat aplikasi java berjalan
// int availableProcessor() --> mendapatkan jumlah core cpu
// long freeMemory() --> mendapatkan jumlah memory bebas di JVM
// long totalMemory() --> mendapatkan jumlah total memory di JVM
// long maxMemory() --> mendapatkan jumlah maksimum memory di JVM
// void gc() --> menjalankan java garbage collecion, untuk menghilangkan data di memory yang sudah tidak terpakai

public class RunTImeClassApp {
    public static void main(String[] args) {
        
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());

    }
}
