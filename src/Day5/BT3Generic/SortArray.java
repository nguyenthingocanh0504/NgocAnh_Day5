package Day5.BT3Generic;

public class SortArray {
    public <T extends MyComparator<T>> void sorted(T[] arr){

    }
    public <T extends MyComparator<T>> void sorted(T[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].compare(arr[j])>0){
                    T tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
}
