package Day3;

import java.util.Scanner;

public class Bai144 {
//    Tìm “số nguyên tố đầu tiên” trong mảng một chiều các số nguyên
//            (nguyentodau). Nếu mảng không có số nguyên tố thì trả về giá trị -1.
        public static int checkNguyenTo(int n){
            if (n<2)
                return 0;
            for (int i=2; i<n; i++)
                if (n%i==0)
                    return 0;
            return 1;
        }
         public static int SNTDauTien(int a[],int n)
            {
                for(int i=0; i<n; i++)
                    if(checkNguyenTo(a[i])==1)
                        return a[i];
                return -1;
            }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so phan tu n: ");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("\nNhap phan tu cua mang: ");
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("\nMang vua nhap: ");
            for (int i=0;i<n;i++){
                System.out.print(arr[i]+"\t");
            }

            System.out.println("\nSo nguyen to dau tien: ");
            System.out.println(SNTDauTien(arr,n));
        }
}
