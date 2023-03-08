package Day3;

public class Bai117 {
    public static double luyThua(int x, int n){
        return Math.pow(x,n);
    }
    public static void tinhTongNSo(int x, int n){
        long t=0;
        for(int i=1;i<=n;i++)
        {
            t += luyThua(x,i);
        }
        System.out.println("Tong = "+t);
    }

    public static void main(String[] args) {
        tinhTongNSo(2,3);
    }
}
