package Day3;

public class Bai143 {
//    Viết hàm tìm “số chẵn đầu tiên” trong mảng các số nguyên (chandau).
//    Nếu mảng không có giá trị chẵn thì hàm sẽ trả về giá trị không chẵn là -1
    public static double chanDauTien(double[] arr){
        for (int i=1;i<arr.length;i++){
            if (arr[i]%2==0){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] arr1={1.0,3.0,-5.0,9.7};
        System.out.println(chanDauTien(arr1));
    }

}
