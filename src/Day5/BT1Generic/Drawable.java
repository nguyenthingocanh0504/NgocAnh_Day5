package Day5.BT1Generic;

public class Drawable {

    public <T extends HinhHoc> void draw(T t){
        String tmp = String.format("Ve hinh %s, cp dien tich la %.2f",t.getClass().getSimpleName(),t.tinhChuVi(),t.tinhDienTich());
        System.out.println(tmp);
    }

}
