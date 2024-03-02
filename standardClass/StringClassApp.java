package standardClass;

import java.util.StringJoiner;

public class StringClassApp {
    public static void main(String[] args) {

        String name = "Dira sanjaya wardana";

        // di java String yang telah dibuat tidak bisa berubah, jadi ketika diubah menggunakan standard class, akan membuat string baru, sehingga memakan memori yang cukup banyak

        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();
        int nameLength = name.length();
        boolean nameStartsWith = name.startsWith("D");
        boolean nameEndsWith = name.endsWith("a");
        char nameCharAt = name.charAt(1);
        char[] nameCharArray = name.toCharArray();
        String[] nameSplit = name.split(" ");
        boolean nameIsBlank = name.isBlank(); // jika hanya berisi spasi maka tetap dianggap kosong
        boolean namIsEmpty = name.isEmpty(); // mengecek apakah string kosong atau ada isinya minimal spasi

        System.out.println(nameSplit[0]);

        // untuk mengatasi konsumsi memori yang terlalu banyak, bisa menggunakan StringBuffer dan StringBuilder
        // StringBuffer --> digunakan untuk memanipulasi string secara paralel bersamaan, thread safe, namun peformanya lebih lambat dari string builder
        // stringBuilder --> digunakan untuk memanipulasi string secara berurutan, tidak thread safe

        // contoh penggunaan string builder
        StringBuilder contohBuilder = new StringBuilder();
        contohBuilder.append("contoh1");
        contohBuilder.append("contoh2");
        contohBuilder.append("contoh3");
        System.out.println(contohBuilder);

        // StringJoiner --> class yang bisa digunakan untuk membuat String sequence yang dipisahkan oleh delimiter
        String[] names ={"dira", "sanjaya", "wardana"};
        StringJoiner namesJoiner = new StringJoiner("||", "prefix", "suffix");
        for (var item : names){
            namesJoiner.add(item);
        }
        System.out.println(namesJoiner.toString());

    }
}
