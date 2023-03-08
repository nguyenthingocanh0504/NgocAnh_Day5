package HinhTron;

public class HinhTron {
    float r;
    public double tinhChuVi(){
        return 2*3.14*Math.PI;
    }
    public double tinhDienTich(){
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                '}';
    }
    public HinhTron(float r){
        this.r=r;
    }
    public HinhTron(){

    }
}
