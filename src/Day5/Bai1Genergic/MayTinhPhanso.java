package Day5.Bai1Genergic;

public class MayTinhPhanso extends MayTinh<PhanSo>{
    public MayTinhPhanso() {
    }

    @Override
    public PhanSo tong(PhanSo... phanSos) {
        PhanSo t=new PhanSo();
            for (PhanSo d:phanSos) {
                t=t.cong(d);
            }
            return t;
    }

    @Override
    public PhanSo hieu(PhanSo t1, PhanSo t2) {
        return null;
    }

    @Override
    public PhanSo tich(PhanSo... phanSos) {
        return null;
    }

    @Override
    public PhanSo thuong(PhanSo t1, PhanSo t2) {
        return null;
    }
}
