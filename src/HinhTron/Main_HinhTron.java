package HinhTron;

import java.util.Scanner;

public class Main_HinhTron {
    public static void main(String[] args) {
//        BT2. Tạo class HinhTron có các thuộc tính bán kính.
//        Có 2 phương thức:
//        + tinhChuVi(): double
//        + tinhDienTich(): double
//        + toString(): String (tạo tự động)
        HinhTron h=new HinhTron();
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap ban kinh hinh tron: ");
        h.r=Float.parseFloat(sc.nextLine());

        System.out.println(h.toString());

        System.out.println("Chu vi hinh tron la: "+h.tinhChuVi());
        System.out.println("\nDien tich hinh tron la: "+h.tinhDienTich());

//        BT3. Tạo 1 mảng HinhTron( class tạo từ BT2).
//        a. In ra hình có chu vi lớn nhất.
//        b. In ra hình có diện tích bé nhất.
//        c. Tính trung bình của chu vi các hình tròn.
//                d. Có bao nhiêu hình có chu vi lớn hơn trung bình cộng chu vi
//                (tính ở ý c)
//        e. Sắp xếp theo bán kính tăng dần và in ra.

        System.out.println("\nNhap kich thuoc hinh tron: ");
        int n=sc.nextInt();
        System.out.println("\nNhap cac phan tu cua mang: ");
        HinhTron[] arr=new HinhTron[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Ban kinh hinh tron thu %d: ",i+1);
            float BanKinh=sc.nextFloat();
            arr[i]= new HinhTron(BanKinh);
        }
        //in mang
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }
        //tinh chu vi lon nhat
        double max = arr[0].tinhChuVi();
        for (int i = 0; i < n; i++) {
            if(arr[i].tinhChuVi()>max){
                max=arr[i].tinhChuVi();
            }
        }
        System.out.println("Chu vi hinh tron lon nhat: "+max);

        //tinh chu vi nho nhat
        double min = arr[0].tinhChuVi();
        for (int i = 0; i < n; i++) {
            if(arr[i].tinhChuVi()<min){
                min=arr[i].tinhChuVi();
            }
        }
        System.out.println("Chu vi hinh tron lon nhat: "+min);
        // tinh trung binh chu vi cac hinh tron
        double tong=0;
        for (int i = 0; i < n; i++) {
            tong = tong+arr[i].tinhChuVi();
        }
        //d
        double avg=tong/n;
        System.out.println("Chu vi hinh tron lon nhat: "+avg);
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i].tinhChuVi()>avg){
                count++;
            }
        }
        System.out.println("So hinh tron co chu vi lon hon trung binh cong: "+count);
        //e
        double temp = arr[0].tinhChuVi();
        for (int i = 0 ; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].r > arr[j].r) {
                    HinhTron h1=arr[i];
                    arr[i]=arr[j];
                    arr[j]=h1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }

    }

}
