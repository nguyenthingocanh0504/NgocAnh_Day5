package Day5.Bai1Genergic;

import java.math.BigInteger;

public class PhanSo {
    private long tuso=0;
    private long mauso=1;

    public PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public PhanSo() {
    }

    public long getMauso() {
        return mauso;
    }

    public void setMauso(long mauso) {
        this.mauso = mauso;
    }

    public long getTuso() {
        return tuso;
    }

    public void setTuso(long tuso) {
        this.tuso = tuso;
    }

    @Override
    public String toString() {
        return String.format("%d/%d",tuso,mauso);
    }
    public PhanSo rutGonPhanSo(){
        BigInteger b1=new BigInteger(String.valueOf(tuso));
        BigInteger b2=new BigInteger(String.valueOf(mauso));
        long ucln=b1.gcd(b2).longValue();
        tuso=tuso/ucln;
        mauso=mauso/ucln;
        return this;
    }
    public PhanSo cong(PhanSo p){
        PhanSo tmp=new PhanSo();
        long tusomoi=this.tuso*p.mauso+p.tuso*this.mauso;
        long mausomoi=this.mauso*p.mauso;
        return new PhanSo(tusomoi,mausomoi);
    }
    public PhanSo nhan(PhanSo p){
        PhanSo tmp=new PhanSo();
        long tusomoi=this.tuso*p.tuso;
        long mausomoi=this.mauso*p.mauso;
        return new PhanSo(tusomoi,mausomoi);
    }
}
