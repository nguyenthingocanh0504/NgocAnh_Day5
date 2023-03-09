package Day5.Bai1Genergic;

public class MayTinhDouble extends MayTinh<Double>{

    public MayTinhDouble() {
    }

    @Override
    public Double tong(Double... doubles) {
        double t=0;
        for (double d:doubles) {
            t=t+d;
        }
        return t;
    }

    @Override
    public Double hieu(Double t1, Double t2) {
        return t1-t2;
    }

    @Override
    public Double tich(Double... doubles) {
        double t=1;
        for (double d:doubles) {
            t=t*d;
        }
        return t;
    }

    @Override
    public Double thuong(Double t1, Double t2) {
        return t1/t2;
    }
}
