package Day3;

public class Bai142 {
//    Tìm “giá trị nhỏ nhất” trong mảng một chiều số thực (nhonhat).

    public static double minArr(double[] arr){
        double min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double[] arr1={1.0,2.0,-5.0,9.7};
        double[] arr2={1.5,2.5,8.5,9.7,1.0,2.4};
        System.out.println(minArr(arr1));
        System.out.println(minArr(arr2));
    }
}
