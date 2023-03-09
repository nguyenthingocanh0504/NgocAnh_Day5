package Day5.BT3Generic;

public interface MyComparator<T extends MyComparator> {
    int compare(T o1);
}
