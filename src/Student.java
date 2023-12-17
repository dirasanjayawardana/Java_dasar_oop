/**
 * inheritance --> mewarisi semua field/atribut dan method dari class parent ke class lainnya (child) - dengan menggunakan extends
 * "super" digunakan untuk mengakses field/atribut atau method yang ada di class parentnya
 * jika parent memiliki contructor yang tidak memiliki parameter (default construcotr) maka pada class child tidak wajib memanggil constructor dari parent
 */

class Student extends Person{
    String university;

    //------ memanggil constructor pada class parent dengan "super()" ------//
    Student(String name, String address, String university){
        super(name, address);
        this.university = university;
    }

    //------ override method sayhello() (nama method dan parameter yg akan dioverriding harus sama) ------//
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + super.name + ", Student of " + this.university);
    }
}
