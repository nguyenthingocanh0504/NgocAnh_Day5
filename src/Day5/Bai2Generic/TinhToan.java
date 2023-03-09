package Day5.Bai2Generic;

public interface TinhToan <T>{
    public T cong(T...args);
    public T tru(T t1, T t2);
    public T nhan(T...args);
    public T chia (T t, T t2);
}
