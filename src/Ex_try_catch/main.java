package Ex_try_catch;

public class main {
    public static void main(String[] args) {
        HinhTron h=new HinhTron(3);
        try {
            h.setBanKinh(-1);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
