package Day5.BT1;

public abstract class HinhHoc {
    private String mauSac="red";
    public HinhHoc(){

    }

    public HinhHoc(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
