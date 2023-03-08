package Day3;

import java.util.Scanner;

public class Bai145 {
    public static int checkSoHoanHao(int n){
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                return n;
            }
        }
        return 1;
    }
    public static int SoHoanHaoDauTien(int a[],int n)
    {
        for(int i=0; i<n; i++)
            if(checkSoHoanHao(a[i])!=1)
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
        System.out.println(SoHoanHaoDauTien(arr,n));
    }
}
