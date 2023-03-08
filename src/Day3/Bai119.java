package Day3;

public class Bai119 {
//    Liệt kê tất cả các số nguyên tố nhỏ hơn n.
    public static void LaSoNguyenTo(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {

    }
}
