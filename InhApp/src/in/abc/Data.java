package in.abc;

public class Data<K> {
    private K value;
    public void setValue(K value) {
        this.value = value;
    }
    public K getValue() {
        return value;
    }
}