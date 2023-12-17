 /**
  * class adalah bluprint/cetakan/prototype untuk membuat object
  * nama class di java harus sama dengan nama file
  * OOP merupakan cara pandang (paradigma) dalam pemrograman yang berbasi object
  * "this" digunakan untuk mengakses/merepresentasikan field/atribut atau method yang ada di object saat ini (di scope terluar class)
  */

 class Person {
     //------ menambahkan field/atribut dalam class ------//
     String name;
     String address;
     final String country = "Indonesia";

     /**
      * membuat constructor (method yang akan dipanggil otomatis saat object pertama kali dibuat
      * nama constructor harus sama dengan nama class
      * jika membuat constructor pada class, maka saat membuat object harus mengisikan parameternya --> new Person(params)
      * sama seperti method lainnya, constructor bisa overloading (dideklarasikan lebih  dari 1 tetapi dengan parameter yg berbeda)
      * object yang dibuat akan otomatis menyesuaikan dengan contructor sesuai dengan parameter yang diinput
      * constructor bisa memanggil constructor yang lain, dengan menggunakan this()
      */
     Person(String name, String address){
         this.name = name;
         this.address = address;
     }
     Person(String name){
         this(name, null);
     }
     Person(){
         this(null);
     }

     //------ menambahkan method dalam class ------//
     void sayHello(String name){
         System.out.println("Hello " + name + ", My name is " + this.name);
     }
}
