package Day3;

public class Bai116 {
    public static void tinhTongNSo(int n){
        long t=0;
        for(int i=1;i<=n;i++)
        {
            t += i;
        }
        System.out.println("Tong = "+t);
    }

    public static void main(String[] args) {
        tinhTongNSo(3);
    }
}
