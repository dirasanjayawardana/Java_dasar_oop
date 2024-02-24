// static --> property/field, method, innerclass, dan static blok dari suatu class bisa diakses secara langsung tanpa harus membuat objectnya, cara mengaksesnya --> namaClass.namaProperty
// non-static --> attribute atau method dipanggil dari object

// melakukan import static sehingga untuk mengkases propery static tidak perlu menggunakan nama classnya (import static namaPackage.namaClass.*)

public class PersonApp {
    public static void main(String[] args){
        //------ cara membuat object person dari class Person ------//
        var person1 = new Person("Dira", "Lampung");
        Person person2 = new Person("Andi");
        Person person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Udin");

        //------ mengakses static blok dari suatu class (namaClass.namaPropertyStatic) ------//
        System.out.println(Person.CONTOHSTATICBLOCK);
    }
}
