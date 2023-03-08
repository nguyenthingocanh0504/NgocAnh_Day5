package Day5.Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //viet chuong trinh tinh thuong a/b. Tinh 1 phep tinh se dung
        int a,b;
        Scanner sc=new Scanner(System.in);
        while(true) {
            try {
                System.out.println("a, b = ");
                a = Integer.parseInt(sc.next());
                b = Integer.parseInt(sc.next());
                sc.nextLine();
                //Thuc hien phep chi
                System.out.println("a/b=" + (float) (a / b));
                break;
            } catch (InputMismatchException e) {
                System.out.println("nhap sai du lieu");
            } catch (ArithmeticException e) {
                System.out.println("Loi chia cho 0");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
