package HCN;

import java.util.Scanner;

public class Main_HCN {
    public static void main(String[] args) {
        HinhChuNhat h=new HinhChuNhat();
        h.dai= 3;
        h.rong = 4;
        System.out.printf("Chu vi HCN: %.2f",h.chuVi());
        System.out.printf("Dien tich HCN: %.2f",h.dienTich());

        HinhChuNhat h2=new HinhChuNhat(5,6);
        System.out.printf("\nChu vi HCN: %.2f",h2.chuVi());
        System.out.printf("\nDien tich HCN: %.2f",h2.dienTich());

        //tao HCN - voi cac du lieu tao tu ban phim va in ra
        HinhChuNhat h3=new HinhChuNhat();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nNhap chieu dai: ");
        h3.dai= Double.parseDouble(sc.nextLine());
        System.out.println("Nhap chieu rong: ");
        h3.rong= Double.parseDouble(sc.nextLine());
        System.out.printf("\nChu vi HCN: %.2f",h3.chuVi());
        System.out.printf("\nDien tich HCN: %.2f",h3.dienTich());

        System.out.println("\nNhap so phan tu mang: ");
        int n=sc.nextInt();
        System.out.println("\nNhap cac phan tu mang: ");
        HinhChuNhat[] arr=new HinhChuNhat[n];
        //nhap mang
        for(int i=0;i<n;i++){
            System.out.println("Hinh chu nhat thu "+i);
            System.out.println("Chieu dai: ");
            double chieuDai=sc.nextDouble();
            System.out.println("Chieu rong: ");
            double chieuRong=sc.nextDouble();

            arr[i]=new HinhChuNhat(chieuDai,chieuRong);
        }
        //in ra mang
        for(int i=0;i<n;i++){
            System.out.println(arr[i].toString());
        }
        //in ra hinh chu nhat co dien tich lon nhat
       double dtMax = arr[0].dienTich();
        int vtMax=0;
        for (int i = 0; i < arr.length; i++) {
            if(dtMax<arr[i].dienTich()){
                dtMax=arr[i].dienTich();
                vtMax=i;
            }
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat la: ");
        System.out.println(arr[vtMax].toString());
        System.out.println("Dien tich max: "+dtMax);

    }
}
