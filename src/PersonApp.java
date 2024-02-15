// static --> attribute atau method dipanggil dari class
// non-static --> attribute atau method dipanggil dari object

public class PersonApp {
    public static void main(String[] srgs){
        //------ cara membuat object person dari class Person ------//
        var person1 = new Person("Dira", "Lampung");
        Person person2 = new Person("Andi");
        Person person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Udin");
    }
}
