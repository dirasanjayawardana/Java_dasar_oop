// di java kita bisa membuat sebuah class di dalam class
// keuntungan class yang ada di dalam class, bisa mengakses class terluarnya meskipun propertynya private, menggunakan kata kunci --> ClassTerluar.this

public class InnerClass {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class InnerInnerClass {
        private String name;

        // keuntungan class yang ada di dalam class, bisa mengakses class terluarnya meskipun propertynya private, menggunakan kata kunci --> ClassTerluar.this
        public String getNamaDiClassTerluar(){
            return InnerClass.this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
