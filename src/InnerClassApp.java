// cara membuat class yang ada didalam class tertentu (inner class)

public class InnerClassApp {
    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        inner.setName("dira sanjaya");

        // membuat object dari class yang berada didalam class
        InnerClass.InnerInnerClass innerInner = inner.new InnerInnerClass();
        innerInner.setName("wardana");

        System.out.println(innerInner.getNamaDiClassTerluar());
        System.out.println(innerInner.getName());
    }
}
