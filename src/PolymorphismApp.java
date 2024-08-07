/**
 * polimorphisme --> sebuah objek bisa berubah bentuk
 * polymorphsm --> method dengan nama yang sama dengan parameter berbeda, bisa jumlah parameternya, atau tipe data parameternya
 * polymorphsm overload --> di dalam class yang sama bisa diduplicate dengan parameter yang berbeda
 * polymorphsm override --> method dengan nama sama tapi dari class parent
 * instanceof --> untuk melakukan pengecekan tipe data (hasilnya true atau false)
 */

public class PolymorphismApp {
    public static void main (String[] args) {
        Employee employee = new Employee("Dira");
        employee.sayHello("Andi");

        employee = new Manager("Dira");
        employee.sayHello("Andi");

        employee = new VicePresident("Dira");
        employee.sayHello("Andi");

        sayHello(new Employee("Dira"));
        sayHello(new Manager("Andi"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            // konversi dari tipe employee ke vicePresident
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if(employee instanceof Manager){
            // konversi dari tipe employee ke manager
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
