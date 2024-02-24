package diraPackage.application;
// anonymous class --> membuat class sekaligus membuat onbjectnya
// cocok untuk membuat class yang sederhana dengan interface tertentu
// kekurangannya tidak bisa reusable

import diraPackage.data.AnonymousClass;

public class AnonymousClassApp {
    public static void main(String[] args) {
        AnonymousClass english = new AnonymousClass(){

            @Override
            public void sayHello(){
                System.out.println("Hello World");
            }

            @Override
            public void sayHello(String name){
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();

    }
}
