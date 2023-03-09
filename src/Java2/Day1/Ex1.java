package Java2.Day1;

public class Ex1 <K,V>{
    private K k;
    private V v;

    public Ex1() {
    }

    public Ex1(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "[Key" +
                "k=" + k +
                ", Value v=" + v +
                ']';
    }
}
