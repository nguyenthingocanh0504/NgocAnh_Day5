package HCN;

public class HinhChuNhat {
    double dai,rong;
    //contructor - phuong thuc khoi tao
    public HinhChuNhat(){

    }

    public HinhChuNhat(double dai,double rong){
        this.dai=dai;
        this.rong=rong;
    }
    public double chuVi(){
        return (dai+rong)*2;
    }
    public double dienTich(){
        return dai*rong;
    }
    //alt+insert chon toString
    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "dai=" + dai +
                ", rong=" + rong +
                '}';
    }
}
