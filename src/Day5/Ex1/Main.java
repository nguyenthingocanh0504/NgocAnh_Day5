package Day5.Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("a, b = ");
            a = sc.nextInt();
            b = sc.nextInt();
            sc.close();
            //Thuc hien phep chi
            System.out.println("a/b=" + (float)(a / b));
        }
        catch (InputMismatchException e){
            System.out.println("nhap sai du lieu");
        }
        catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
