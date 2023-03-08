package Day5.BT1;

public class HinhVuong extends HinhHoc{
    private double canh=1.0;
    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }
    public HinhVuong(){

    }
    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong(String mauSac, double canh) {
        super(mauSac);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}
