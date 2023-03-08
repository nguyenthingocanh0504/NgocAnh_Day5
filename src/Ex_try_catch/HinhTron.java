package Ex_try_catch;

public class HinhTron {
    private double banKinh=1.0;
    private HinhTron(){

    }

    public HinhTron(double banKinh) {
        if(banKinh<=0)
            throw new RuntimeException("error");
        else
            this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh<=0)
            throw new RuntimeException("error");
        else
            this.banKinh = banKinh;
    }
    public double tinhChuVi() {
        return 2*Math.PI*banKinh;
    }
    public double tinhDienTich() {
        return Math.PI*banKinh*banKinh;
    }
}
