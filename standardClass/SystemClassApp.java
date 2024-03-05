package standardClass;

// System class --> class yang berisikan banyak utility static method dijava, contohnya :
// String getenv(key) --> mendapatkan environment variabel sistem operasi
// void exit(status) --> menghentika program java
// long currentTimeMillis() --> mendapatkan waktu saat ini dalam milisecond
// long nanoTime() --> mendapatkan waktu saat ini dalam nano second
// void gc() --> menjalankan java garbage collecion, untuk menghilangkan data di memory yang sudah tidak terpakai

public class SystemClassApp {
    public static void main(String[] args) {
     
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getenv("HOME"));

        System.exit(0);
        
    }
}
