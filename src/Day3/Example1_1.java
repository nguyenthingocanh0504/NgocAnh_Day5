package Day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example1_1 {
    // Viet phuong thuc tinh tong 2 so thuc a va b
    public static void tinhTong(float a, float b){
        System.out.println("Tong 2 so la: "+(a+b));
    }

    public static void main(String[] args) {
        tinhTong(3,4);
        System.out.println("Nhap so a: ");
        Scanner sc = new Scanner(System.in);
        float a1=sc.nextFloat();
        System.out.println("Nhap so b: ");
        float b1=sc.nextFloat();
        System.out.println("Tong 2 so la: "+(a1+b1));
    }
}
