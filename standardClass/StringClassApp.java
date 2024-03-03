package standardClass;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringClassApp {
    public static void main(String[] args) {

        // selengkapnya lihat didokumentasi string class

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

        // untuk mengatasi konsumsi memori yang terlalu banyak, bisa menggunakan
        // StringBuffer dan StringBuilder
        // StringBuffer --> digunakan untuk memanipulasi string secara paralel
        // bersamaan, thread safe, namun peformanya lebih lambat dari string builder
        // stringBuilder --> digunakan untuk memanipulasi string secara berurutan, tidak
        // thread safe

        // contoh penggunaan string builder
        StringBuilder contohBuilder = new StringBuilder();
        contohBuilder.append("contoh1");
        contohBuilder.append("contoh2");
        contohBuilder.append("contoh3");
        System.out.println(contohBuilder);

        // StringJoiner --> class yang bisa digunakan untuk membuat String sequence yang
        // dipisahkan oleh delimiter
        String[] names = { "dira", "sanjaya", "wardana" };
        StringJoiner namesJoiner = new StringJoiner("||", "prefix", "suffix");
        for (var item : names) {
            namesJoiner.add(item);
        }
        System.out.println(namesJoiner.toString());

        // StringTokenizer class --> untuk memotong string menjadi token atau string
        // yang lebih kecil, sistemnya lazy, ketika next token baru dipotong, untuk
        // iterasi bisa menggunakan hasMoreToken(), mengecek apakah masih ada token
        // selanjutnya
        StringTokenizer nameTokenizer = new StringTokenizer(name, " ");
        // while (nameTokenizer.hasMoreTokens()){
        // String token = nameTokenizer.nextToken();
        // System.out.println(token);
        // }
        System.out.println("token 1 : " + nameTokenizer.nextToken());
        System.out.println("token 2 : " + nameTokenizer.nextToken());
        System.out.println("token 3 : " + nameTokenizer.nextToken());

    }
}
