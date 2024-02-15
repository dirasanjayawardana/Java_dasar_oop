package diraPackage.data;

// dijava script biasanya field dibuat private, sehinnga untuk mengakses field dari file lain bisa melalui public class (methodnya)
public class GetterSetter {
    private String id;
    private boolean isExpensive;

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isExpensive(){
        return isExpensive;
    }

    public void isExpensive(boolean expensive) {
        this.isExpensive = expensive;
    }
}
