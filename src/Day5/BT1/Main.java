package Day5.BT1;

import java.util.Scanner;

public class Main {
//    BT1.
//            Tạo 1 class trừu tượng HinhHoc có các thuộc tính
//- mauSac: String
//    Có 2 phương thức trừu tượng:
//            + tinhChuVi(): double
//+ tinhDienTich(): double
//
//    Tạo class HinhTron kế thừa từ HinhHoc, có thêm thuộc tính:
//            - banKinh: double = 1.0
//    Làm rõ các phương thức trừu tượng
//    Ghi đè lại toString()
//
//    Tạo class HinhVuong kế thừa từ HinhHoc, có thêm thuộc tính:
//            - canh: double = 1.0
//    Làm rõ các phương thức trừu tượng
//    Ghi đè lại toString()
//
//    a. Nhập vào 1 mảng các đối tượng hình học, lưu ý: có thể gồm hinhTron, hinhVuong...
//    b. In ra hình có diện tích lớn nhất.
//    c. In ra hình có diện tích bé nhất
    public static void main(String[] args) {

        HinhHoc[] arr= {new HinhVuong(5),new HinhTron(5)};
        HinhHoc[] h=new HinhHoc[4];
        h[0]=new HinhTron(3);
        h[1]=new HinhVuong(40);
        h[2]=new HinhTron(10);

        HinhHoc hinhHocMax = null;
        double max=0;
        for (int i = 0; i < arr.length; i++) {
            if(h[i].tinhChuVi()>max)
            {
                max=h[i].tinhChuVi();
                hinhHocMax=h[i];
            }
        }
        System.out.println("Chu vi lon nhat la: "+max);
        System.out.println(hinhHocMax);
        double maxDt=0;
        for (int i = 0; i < arr.length; i++) {
            if(h[i].tinhDienTich()>maxDt)
            {
                maxDt=h[i].tinhDienTich();
                hinhHocMax=h[i];
            }
        }
        System.out.println("Dien tich lon nhat la: "+maxDt);
        System.out.println(hinhHocMax);
    }
}
