package Day5.Bai1Genergic;

public class Main {
    public static void main(String[] args) {
        MayTinh<Double> maytinh=new MayTinhDouble();
        System.out.println(maytinh.tong(3.0,4.0,5.0,6.0));
        System.out.println(maytinh.tich(3.0,4.0,5.0));
    }
}
