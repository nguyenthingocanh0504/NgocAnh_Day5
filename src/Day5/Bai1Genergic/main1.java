package Day5.Bai1Genergic;

public class main1 {
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo(1,2);
        PhanSo ps2=new PhanSo(1,2);
        System.out.println(ps1.cong(ps2).rutGonPhanSo());
        System.out.println(ps1.nhan(ps2).rutGonPhanSo());
    }
}
