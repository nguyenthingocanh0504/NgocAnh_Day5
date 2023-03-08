package Day5.BT1;

public class HinhTron extends HinhHoc{
    private double banKinh=1.0;
    public HinhTron(){

    }

    @Override
    public double tinhChuVi() {
        return 2*Math.PI*banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*banKinh*banKinh;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(String mauSac, double banKinh) {
        super(mauSac);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
